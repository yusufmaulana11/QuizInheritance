import java.util.ArrayList;
//Pintu turunan dari class Item

/*
penggunaan class pintu disini seharusnya menggunakan inheritance
karena memiliki variable dan fungsi yang sama seperti pada class Item
 */

public class Pintu extends Item{

    //constrcutor
    public Pintu(String nama) {
        super(nama);
        //init pilihan
        arrAksi.add("Deskripsikan pintu");
        arrAksi.add("Coba buka pintu");
    }
    @Override
    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
    }
    @Override
    public ArrayList<String> getAksi() {
        return arrAksi;
    }
    @Override
    public void prosesAksi(int subPil) {
        //1: deskripsikan
        //2: buka pintu
        if (subPil==1) {
            System.out.println("Red Door");
            System.out.println("Pintu berwarna merah dengan tulisan 'EXIT' di atas ");
        } else if (subPil==2) {
            //cek apakah mempunyai kunci
            if (objGameInfo.getObjPlayer().cariItem("Kunci")) {
                //kunci ada, pintu terbuka
                System.out.println("Player menggunakan kunci untuk membuka pintu dan pintu terbuka!");
                objGameInfo.setGameOver(true); //game over
            } else {
                //kunci tidak ada
                System.out.println("Player mencboa membuka pintu. TERKUNCI!");
            }
        }
    }
}