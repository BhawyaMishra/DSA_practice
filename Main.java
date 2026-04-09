public class Main {
    public static void main(String[] args) {
        TwoDImensionalArray sda= new TwoDImensionalArray(3, 3);
        sda.insertValue(0, 0, 10);
        sda.insertValue(0, 1, 20);
        sda.insertValue(1, 0, 30);
        sda.insertValue(2, 0, 40);
        
        //sda.accessCell(0,1);
        //sda.traverse2D();

        sda.searchValue(50);
        
        //System.out.println(Arrays.deepToString(sda.arr));
    }
}