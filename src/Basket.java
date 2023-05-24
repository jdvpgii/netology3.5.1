import java.io.File;

public class Basket {
    private String[] productName;
    private int[] price;
    private int[] counterOfEachItem;
    public Basket(String[] productName, int[] price) {
        this.productName = productName;
        this.price = price;
        counterOfEachItem = new int[price.length];
    }

    void addToCart(int productNum, int amount) {
        counterOfEachItem[productNum] += amount;
    }

    void printCart() {
        int productSum = 0;
        System.out.println("Your shopping cart:");
        for (int i = 0; i < productName.length; i++) {
            System.out.println(productName[i] + ": " + price[i] + "$ * " + counterOfEachItem[i] + "pc." + " = " + (price[i] * counterOfEachItem[i]));
            productSum += price[i] * counterOfEachItem[i];
        }
        System.out.println("Total: " + productSum + "$");
    }

//    void saveTxt( File textFile) {
//        //метод сохранения корзины в текстовый файл; использовать встроенные сериализаторы нельзя;
//
//    }
//
//    static Basket loadFromTxtFile(File textFile) {
//        //статический(!) метод восстановления объекта корзины из текстового файла, в который ранее была она сохранена;
//    }
//
//    static Basket saveBin (File file) {
//
//    }
//
//    static Basket loadFromBinFile(File file) {
//        //для загрузки корзины из бинарного файла.
//    }
}

/*
Подсказки
Если все данные у вас хранятся в массивах, то просто сохраните по массиву на каждой строке.
Например, если бы это был лонговый массив в поле нашей корзины, то можно было бы сделать так:

public void saveTxt(File textFile) throws IOException {
    try (PrintWriter out = new PrintWriter(file);) {
        ...
        for (long e : longArrInField)
            out.print(e + " ");
        }
        ...
    }
}

А при чтении вы сможете строку файла разбить через split(" ")и пройдясь циклом каждое значение превратить в long.
 */