public class Nilai{
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;

    //void
    public void nilai(int nilaiUTS, int nilaiUAS, int nilaiTugas){
        double nilaiTotal = (nilaiTugas + nilaiUAS + nilaiUTS)/3;
        System.out.println(nilaiTotal);
    }

    //nonvoid
    public double biji(int nilaiUTS, int nilaiUAS, int nilaiTugas){
        double nilaiTotal = (nilaiTugas + nilaiUAS + nilaiUTS)/3;
        return nilaiTotal;
    }

   
}