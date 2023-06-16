public class prescription {
    private String customer;
    private String airplane;
    private String location;
    private String date;
    private String bK;

    public prescription(String ad, String soyad, String airplane, String location, String date, String bk) {
        customer = ad + " " + soyad;
        this.airplane = airplane;
        this.location = location;
        this.date = date;
        bK = bk;
    }

    public String ucusDondur() {
       

        Reservation rezervasyon = new Reservation();

        String temp = "\n NEREDEN: " + bK + "\n NEREYE: " + location + "\n Uçuş Tarihiniz: " + date +
                "\n ADINIZ SOYADINIZ: " + customer + "\n Uçağınız: " + airplane +
                "\n Koltuk Numaranız: " + rezervasyon.getPassangerNumber() + "\n Bilet Tutarınız: " +
                rezervasyon.getPrice() + "TL";
        return temp;
    }

    private class Reservation {
        private int passangerNumber;
        private double price;

        public Reservation() {
           
        }

        public int getPassangerNumber() {
            return passangerNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}
