package ShopPC;

public class PC {

    private String brend;
    private String os;
    private int display;
    private int osy;
    private int vCard;
    private int hd;




    public PC(String brend, String os, int display, int osy, int vCard, int hd) {
        this.brend = brend;
        this.os = os;
        this.display = display;
        this.osy = osy;
        this.vCard = vCard;
        this.hd = hd;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    public int getOsy() {
        return osy;
    }

    public void setOsy(int osy) {
        this.osy = osy;
    }

    public int getVideoCard() {
        return vCard;
    }

    public void setVideoCard(int videoCard) {
        this.vCard = videoCard;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }


    @Override
    public String toString() {
        return "PC{" +
                "brend='" + brend + '\'' +
                ", os='" + os + '\'' +
                ", display=" + display +
                ", osy=" + osy +
                ", videoCard=" + vCard +
                ", hd=" + hd +
                '}';
    }
}
