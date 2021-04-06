import java.util.ArrayList;
//NPC turunan dari class item

/*
Dalam konteks ini, kita bisa menggunakan inheritance terhadap class NPC, mengapa?
karena pada class NPC terdapat dua kali penginisiasian variabel dan fungsi yang
diperlukan, sementara dengan menggunakan inheritance kita seharusnya tidak perlu
membuat variabel dan fungsi sebanyak dua kali, kita bisa turunkan variabel dan
fungsi yang sama pada class item untuk dipakai di NPC dengan cara penggunaan inheritance
 */

public class NPC extends Item {
    private Item  objKunci;
    private boolean isKenal = false;
    //setelah kita melakukan turunan terhadap class NPC dari class item
    //kita tidak perlu menuliskan kembali variable-variable yang sudah tercantum di Item
    //kita hanya deklarasikan variable yang kita perlukan dan belum ada di superClass

    @Override
    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
        objKunci.setObjGameInfo(objGameInfo);
    }

    @Override
    public ArrayList<String> getAksi() { return arrAksi; }

    public NPC(String nama){
        super(nama);
        objKunci = new Item("Kunci");
        objKunci.setDeskripsi("Sebuah kunci kecil yang sudah agak berkarat");

        //aksi npc
        arrAksi.add("Perkenalan dgn NPC");
        arrAksi.add("Minta kunci");

    }

    @Override
    public void prosesAksi(int subPil) {
        //1: perkenalan dengan npc
        //2: buka pintu
        if (subPil == 1) {
            System.out.println("--Guardian--");
            System.out.println("Halo saya penjaga pintu ini");
            isKenal = true;
        } else if (subPil == 2) {
            if (isKenal) {
                //berikan kunci pada player
                if (objKunci==null) {
                    System.out.println("Masa lupa, kunci kan sudah saya berikan!");
                } else
                {
                    System.out.println("Kunci diberikan pada player");
                    objGameInfo.getObjPlayer().addItem(objKunci);     //tambahkan  objek ini pada player
                    objKunci = null;
                }

            } else {
                System.out.println("Siapa anda? kenalan dulu dong");
            }
        }
    }
}