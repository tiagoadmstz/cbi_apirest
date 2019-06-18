/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.util;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tiago.teixeira
 */
public abstract class Datas {

    public static final String DATE_BR = "dd/MM/yyyy", DATE_US = "yyyy-MM-dd", HORA_HM = "HH:mm", DATE_EX = "dd 'de' MMMM 'de' yyyy",
            DATETIME_BR = "dd/MM/yyyy - HH:mm";
    private static final SimpleDateFormat DAY = new SimpleDateFormat("dd");
    private static final SimpleDateFormat MONTH = new SimpleDateFormat("MM");
    private static final SimpleDateFormat YEAR = new SimpleDateFormat("yyyy");
    private static final SimpleDateFormat DATE = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat DATETIME = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.S");

    public static String calcularIdade(String dataNascimento, String padrao) {
        try {
            return String.valueOf(LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern(padrao == null ? DATE_BR : padrao)).until(LocalDate.now()).getYears());
        } catch (Exception e) {
            return "";
        }
    }

    public static String calcularIdade(String dataNascimento) {
        try {
            return calcularIdade(LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern(DATE_BR)));
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 30a 8m 21d
     *
     * @param data_nascimento
     * @return
     */
    public static String calcularIdade(LocalDate data_nascimento) {
        try {
            Period p = data_nascimento.until(LocalDate.now());
            return doisDigitos(p.getYears()) + "a " + doisDigitos(p.getMonths()) + "m " + doisDigitos(p.getDays()) + "d";
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * Este método calcula a duração entre dois horários
     *
     * @param entrada LocalDateTime com valor inicial
     * @param saida LocalDateTime com valor final
     * @return String com duração formatada HH:mm
     */
    public static String calcularDuracao(LocalDateTime entrada, LocalDateTime saida) {
        try {
            Duration drt = Duration.between(entrada, saida);
            LocalTime lt = LocalTime.ofNanoOfDay(drt.toNanos());
            return lt.format(DateTimeFormatter.ofPattern("HH:mm"));
        } catch (Exception ex) {
            ex.printStackTrace();
            return "";
        }
    }

    /**
     * Transforma um integer em uma string de dois digitos. Ex: 1 para 01
     *
     * @param valor
     * @return
     */
    public static String doisDigitos(int valor) {
        return valor < 10 ? "0" + String.valueOf(valor) : String.valueOf(valor);
    }

    /**
     * Função que manipula String no formato de hora "HH:mm" facilitando para o
     * usuário no momento da digitação ou retorna a hora atual.
     * <br>
     * Exemplo: <br>
     * Entrada do usuário: 1:12 ou 112<br>
     * Devolve: 01:12<br>
     *
     * @param hora valor do campo de hora
     * @return String Hora Formatada
     * @param solicitacao int <br><b>0</b> para hora atual<br><b>1</b> para
     * manipulação de hora
     */
    public static String getHour(String hora, int solicitacao) {
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("HH:mm");
        String[] h = null;
        String resultado = "";

        try {
            //verifica a solicitação do usuário
            if (solicitacao == 0) {
                return f.format(date);
            } else {
                //verifica se a variável passada é nula ou vazia
                if (hora != null || !"".equals(hora)) {
                    //verifica se a variável contêm o ponto de separação
                    if (hora.contains(":")) {
                        h = hora.split(":");
                        //verifica a quantidade de digitos e se a posição do dois pontos
                        resultado = hora.indexOf(":") == 1 ? "0" : "";
                        //loop para setar a variável de saída
                        for (int i = 0; i < h.length; i++) {
                            if (i == 1 && hora.indexOf(":") == 1 && hora.length() == 3 || i == 1 && hora.indexOf(":") == 2 & hora.length() == 4) {
                                resultado += ":0";
                            } else if (i == 1 && hora.length() == 5 && hora.indexOf(":") == 2) {
                                resultado += ":";
                            }
                            resultado += h[i];
                        }
                    } else {
                        char[] letras = hora.toCharArray();
                        resultado = hora.length() == 2 ? "0" : hora.indexOf("0") != 0 && hora.length() == 3 ? "0" : hora.indexOf("0") == 2 && hora.length() == 3 ? "0" : "";
                        for (int i = 0; i < letras.length; i++) {
                            if (hora.length() == 2 && i == 1 && hora.length() < 4) {
                                resultado += ":0";
                            } else if (i == 2 && hora.length() == 3 && hora.indexOf("0") == 0) {
                                resultado += ":0";
                            } else if (i == 2 && hora.length() == 4) {
                                resultado += ":";
                            } else if (i == 1 && letras.length == 3 && hora.indexOf("0") != 0) {
                                resultado += ":";
                            }
                            resultado += String.valueOf(letras[i]);
                        }
                    }
                }
                return verificaHora(resultado) ? resultado : f.format(date);
            }
        } catch (Exception ex) {
            return f.format(date);
        }
    }

    private static boolean verificaHora(String hora) {
        String hm[] = hora.split(":");
        int h = Integer.parseInt(hm[0]);
        int m = Integer.parseInt(hm[1]);
        boolean resultado;

        resultado = h >= 0 && h <= 24;
        if (resultado) {
            if (h == 24 && m == 0) {
                resultado = true;
            } else if (h <= 23) {
                resultado = m >= 0 && m <= 59;
            } else {
                resultado = false;
            }
        }

        return resultado;
    }

    /**
     * Função que manipula String no formato de data "dd/MM/yyyy" facilitando
     * para o usuário no momento da digitação ou retorna a data atual.
     * <br>
     * Exemplo: <br>
     * Entrada do usuário: 1/1/15<br>
     * Devolve: 01/01/2015<br>
     *
     * @param data
     * @return String data
     * @param solicitacao int <br><b>0</b> para data atual<br><b>1</b> para
     * manipulação de data
     */
    public static String getDateString(String data, int solicitacao) {

        String temp = "";
        String strData[] = null;
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date x = new Date();

        if (data != null || !"".equals(data) && solicitacao == 1) {
            try {

                if (data.contains("/")) {
                    strData = data.split("/");
                } else {
                    strData = new String[1];
                    strData[0] = "";
                }

                if (strData.length != 3) {
                    if (strData.length == 2) {
                        temp = dinamicDate(strData[0], strData[1], "0");
                    } else {
                        temp = DATE.format(x);
                    }
                } else {
                    temp = dinamicDate(strData[0], strData[1], !"".equals(strData[2]) ? strData[2] : "0");
                }
            } catch (Exception excep) {
                temp = DATE.format(x);
            }
        } else if (solicitacao == 0) {
            temp = DATE.format(x);
        }

        return temp;
    }

    public static String getDateString(Date data) {
        try {
            return DATE.format(data);
        } catch (Exception e) {
            return "";
        }
    }

    public static String getDateString(LocalDate data) {
        try {
            return data.format(DateTimeFormatter.ofPattern(DATE_BR));
        } catch (Exception e) {
            return "";
        }
    }

    public static String getDateString(LocalDateTime data) {
        try {
            return data.format(DateTimeFormatter.ofPattern(DATETIME_BR));
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * Monta uma data no formato para apresentação em documentos. Ex:
     * Sertãozinho, 01 de janeiro de 2018 ou 01 de janeiro de 2018.
     *
     * @param cidade String com o nome da cidade
     * @param data LocalDate com a data para conversão
     * @return String com a data convertida
     */
    public static String getDateExtend(String cidade, LocalDate data) {
        try {
            String temp = "";
            if (cidade != null) {
                temp = temp.concat(cidade.concat(", "));
            }
            temp = temp.concat(data.format(DateTimeFormatter.ofPattern(DATE_EX)));
            return temp;
        } catch (Exception e) {
            return "";
        }
    }

    public static String getDateTimeString(Date data) {
        try {
            return DATETIME.format(data).substring(0, 21);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getTimeString(LocalTime time) {
        try {
            return time.format(DateTimeFormatter.ofPattern(HORA_HM));
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * Este método converte uma data informada como String em um objeto do tipo
     * Date.
     *
     * @param data String contendo a data no formato "dd/MM/yyyy"
     * @return Objecto do tipo Date
     */
    public static Date getDate(String data) {
        try {
            return DATE.parse(data);
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Este método converte uma data informada como String em um objeto do tipo
     * Date.
     *
     * @param data String contendo a data no formato "dd/MM/yyyy HH:mm:ss.S"
     * @return Objecto do tipo Date
     */
    public static Date getDateTime(String data) {
        try {
            return DATETIME.parse(data);
        } catch (Exception ex) {
            return null;
        }
    }

    public static String dinamicDate(String dia, String mes, String ano) {
        return verificarDia(dia) + "/" + verificarMes(mes) + "/" + verificarAno(ano);
    }

    public static String dinamicDate(int dia, int mes, int ano) {
        return verificarDia(String.valueOf(dia)) + "/" + verificarMes(String.valueOf(mes)) + "/" + verificarAno(String.valueOf(ano));
    }

    public static String dinamicDate(String mes, String ano) {
        return verificarMes(mes) + "/" + verificarAno(ano);
    }

    public static String verificarDia(String dia) {
        try {
            String result = "";
            int dia_int = Integer.parseInt(dia);
            if (dia_int > 0 && dia_int < 31) {
                result = dia_int < 10 ? result + "0" + dia_int : result + dia_int;
            } else {
                result = result + "31";
            }
            return result;
        } catch (Exception ex) {
            return MonthDay.now().format(DateTimeFormatter.ofPattern("dd"));
        }
    }

    public static String verificarMes(String mes) {
        try {
            String result = "";
            int mes_int = Integer.parseInt(mes);
            if (mes_int > 0 && mes_int < 13) {
                result = mes_int < 10 ? result + "0" + mes_int : result + mes_int;
            } else {
                result = result + "12";
            }
            return result;
        } catch (Exception ex) {
            return YearMonth.now().format(DateTimeFormatter.ofPattern("MM"));
        }
    }

    public static String verificarAno(String ano) {
        try {
            String result = "";
            int ano_int = Integer.parseInt(ano);
            long ano_atual = Long.parseLong(Year.now().toString());
            String ano_user = ano_int != 0 ? Integer.toString(ano_int) : Year.now().toString();
            long diferenca_atual_user = ano_atual - ano_int;

            if (ano_user.length() > 0 && ano_user.length() == 2) {
                result = diferenca_atual_user >= 2000 ? result + "20" + ano_user : result + "19" + ano_user;
            } else if (ano_user.length() > 0 && ano_user.length() == 1) {
                result = diferenca_atual_user >= 2000 ? result + "200" + ano_user : result + "190" + ano_user;
            } else if (ano_user.length() == 3 || ano_user.length() >= 5) {
                result = result + Year.now().toString();
            } else {
                result = result + ano_user;
            }
            return result;
        } catch (Exception ex) {
            return Year.now().toString();
        }
    }

    public static LocalDate dateToLocalDate(Date date) {
        return LocalDate.parse(Datas.getDateString(date), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static LocalDateTime dateToLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    public static Timestamp dateToTimeStamp(Date date) {
        return new Timestamp(date.toInstant().toEpochMilli());
    }

    public static Date localDateToDate(LocalDate localdate) {
        return new Date(localDateToMillis(localdate));
    }

    public static Date localDateTimeToDate(LocalDateTime localdatetime) {
        return new Date(localDateTimeTomillis(localdatetime));
    }

    public static Timestamp localDateToTimeStamp(LocalDate localDate) {
        return new Timestamp(Datas.getDate(Datas.getDateString(localDate)).toInstant().toEpochMilli());
    }

    public static Timestamp localDateTimeToTimeStamp(LocalDateTime localDateTime) {
        return new Timestamp(ZonedDateTime.of(localDateTime, ZoneId.of("UTC")).toInstant().toEpochMilli());
    }

    public static Timestamp stringToTimeStamp(String date) {
        return new Timestamp(Datas.getDate(date).toInstant().toEpochMilli());
    }

    public static LocalDate stringToLocalDate(String string) {
        if (string != null) {
            if (!"".equals(string)) {
                return LocalDate.parse(string, DateTimeFormatter.ofPattern(DATE_BR));
            }
        }
        return LocalDate.now();
    }

    public static Time localTimeToTime(LocalTime localtime) {
        return new Time(ZonedDateTime.of(LocalDate.now(), localtime, ZoneId.of("UTC")).toInstant().toEpochMilli());
    }

    public static LocalTime stringToLocalTime(String string) {
        if (string != null) {
            if (!"".equals(string)) {
                return LocalTime.parse(string, DateTimeFormatter.ofPattern(HORA_HM));
            }
        }
        return LocalTime.of(0, 0);
    }

    public static LocalDateTime stringToLocalDateTime(String data, String horario) {
        return LocalDateTime.of(stringToLocalDate(data), stringToLocalTime(horario));
    }

    public static LocalDateTime millisToLocalDateTime(Long millis) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneId.systemDefault());
    }

    public static Long localDateTimeTomillis(LocalDateTime localdatetime) {
        return ZonedDateTime.of(localdatetime, ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static Long localDateToMillis(LocalDate localDate) {
        return localDateTimeTomillis(LocalDateTime.of(localDate, LocalTime.of(0, 0)));
    }

    public static Long localTimeToMillis(LocalTime localTime) {
        return localDateTimeTomillis(LocalDateTime.of(LocalDate.now(), localTime));
    }

    public static Long stringToMillis(String data) {
        return localDateToMillis(stringToLocalDate(data));
    }

    public static LocalDate millisToLocalDate(Long millis) {
        return millisToLocalDateTime(millis).toLocalDate();
    }

    public static LocalTime millisToLocalTime(Long millis) {
        return millisToLocalDateTime(millis).toLocalTime();
    }

    public static Integer splitDay(Date date) {
        return Integer.valueOf(DAY.format(date));
    }

    public static Integer splitMonth(Date date) {
        return Integer.valueOf(MONTH.format(date));
    }

    public static Integer splitYear(Date date) {
        return Integer.valueOf(YEAR.format(date));
    }

    public static String getMesExtenso(int mes) {
        return getMesExtenso(String.valueOf(mes));
    }

    public static String getMesExtenso(String mes) {
        if (mes != null) {
            switch (mes) {
                case "1":
                case "01":
                    return "Janeiro";
                case "2":
                case "02":
                    return "Fevereiro";
                case "3":
                case "03":
                    return "Março";
                case "4":
                case "04":
                    return "Abril";
                case "5":
                case "05":
                    return "Maio";
                case "6":
                case "06":
                    return "Junho";
                case "7":
                case "07":
                    return "Julho";
                case "8":
                case "08":
                    return "Agosto";
                case "9":
                case "09":
                    return "Setembro";
                case "10":
                    return "Outubro";
                case "11":
                    return "Novembro";
                case "12":
                    return "Dezembro";
            }
        }
        return null;
    }

    public static String getDiaSemanaExtenso(int dia) {
        return getDiaSemanaExtenso(String.valueOf(dia));
    }

    public static String getDiaSemanaExtenso(String dia) {
        switch (dia) {
            case "1":
            case "01":
                return "Segunda-feira";
            case "2":
            case "02":
                return "Terça-feira";
            case "3":
            case "03":
                return "Quarta-feira";
            case "4":
            case "04":
                return "Quinta-feira";
            case "5":
            case "05":
                return "Sexta-feira";
            case "6":
            case "06":
                return "Sábado-feira";
            case "7":
            case "07":
                return "Domingo";
            default:
                return null;
        }
    }

    /**
     * Este método monta uma lista com todos os meses entre duas datas,
     * incluindo os meses das datas informadas. Ex: dataInicial = "01/01/2018" e
     * dataFInal = "27/04/2018".
     *
     * Saída: [01/01/2018, 01/02/2018, 01/03/2018, 01/04/2018]
     *
     * @param dataInicial Data inicial com formato dd/MM/yyyy
     * @param dataFinal Data final com formato dd/MM/yyyy
     * @return Lista com as datas
     */
    public static List<LocalDate> getMonthRange(String dataInicial, String dataFinal) {
        try {
            List<LocalDate> lista = new ArrayList();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d1 = LocalDate.parse(dataInicial, dtf).with(ChronoField.DAY_OF_MONTH, 1);
            LocalDate d2 = LocalDate.parse(dataFinal, dtf).with(ChronoField.DAY_OF_MONTH, 1);
            lista.add(d1);
            while (d1.isBefore(d2)) {
                d1 = d1.plusMonths(1l);
                lista.add(d1);
            }
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Este método monta uma lista com todos os meses entre duas datas,
     * incluindo os meses das datas informadas. Ex: dataInicial = "01/01/2018" e
     * dataFInal = "27/04/2018".
     *
     * Saída: [01/01/2018, 01/02/2018, 01/03/2018, 01/04/2018]
     *
     * @param dataInicial Data inicial com formato dd/MM/yyyy
     * @param dataFinal Data final com formato dd/MM/yyyy
     * @return Lista com as datas
     */
    public static List<LocalDate> getMonthRange(Date dataInicial, Date dataFinal) {
        return getMonthRange(getDateString(dataInicial), getDateString(dataFinal));
    }

    /**
     * Este método monta uma lista com todos os meses entre duas datas,
     * incluindo os meses das datas informadas. Ex: dataInicial = "01/01/2018" e
     * dataFInal = "27/04/2018".
     *
     * Saída: [01/01/2018, 01/02/2018, 01/03/2018, 01/04/2018]
     *
     * @param dataInicial Data inicial com formato dd/MM/yyyy
     * @param dataFinal Data final com formato dd/MM/yyyy
     * @return Lista com as datas
     */
    public static List<LocalDate> getMonthRange(LocalDate dataInicial, LocalDate dataFinal) {
        return getMonthRange(getDateString(dataInicial), getDateString(dataFinal));
    }

}
