public class Biodata {
    public static void main(String[] args) {
        //kepala
        String bio = "My Biodata" ;
        System . out . println (bio) ;

        String namaDepan = "DINA" ;
        String namaBelakang = "FADILA";
        String dusun = "BUNSALAK";
        String jeniKelamin = "Perempuan";
         int tanggal=15;
         int bulan=9;
         int tahun1=2001;
         int tahun2=2022;
         int tahunow=tahun2-tahun1;

         System . out . println ("Nama Lengkap : " + namaDepan+namaBelakang);
         System . out . println ("Tanggal Lahir : " + dusun+" "+tanggal+"/"+bulan+"/"+tahun1);
         System . out . println ("Umur : "+ tahunow+" "+" Tahun");
         System . out . println (" jenis Kelamin : "+ jeniKelamin );

    }
}