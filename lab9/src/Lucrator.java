public class Lucrator {
    CalendarLucru calendarLucru;
    String nume;

    public Lucrator(CalendarLucru calendarLucru, String nume) {
        this.calendarLucru = calendarLucru;
        this.nume = nume;
    }

    public Lucrator() {
        this.calendarLucru = new CalendarLucru();
        nume = "GIGEL";
    }

    public CalendarLucru getCalendarLucru() {
        return calendarLucru;
    }

    public void setCalendarLucru(CalendarLucru calendarLucru) {
        this.calendarLucru = calendarLucru;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public void lucreaza(DAY zi) throws ExceptieZiNelucratoare {
        if(!calendarLucru.getZile(zi).lucratoare) throw new ExceptieZiNelucratoare();
        System.out.println("Muncitorul "+this.toString()+ " lucreaza " + zi.toString());
    }

    @Override
    public String toString() {
        return "Lucrator{" +
                "calendarLucru=" + calendarLucru.toString() +
                ", nume='" + nume + '\'' +
                '}';
    }
}
