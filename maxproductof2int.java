public class maxproductof2int {
    public String maxProduct(int[] intArray) {
        int maxProduct = 0;
        String pairs = "";

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProduct) {
                    maxProduct = intArray[i] * intArray[j];
                    pairs = intArray[i] + "," + intArray[j];
                }
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        maxproductof2int obj = new maxproductof2int();

        int[] intArray = {10, 20, 30, 40, 50};

        System.out.println(obj.maxProduct(intArray));
    }
}
