import java.io.File;

public class Basket {
    public Basket(String[] productName, int[] price) {

    }

    void addToCart(int productNum, int amount) {
        //метод добавления amount штук продукта номер productNum в корзину;
    }

    void printCart() {
        //метод вывода на экран покупательской корзины.
    }

    void saveTxt( File textFile) {
        //метод сохранения корзины в текстовый файл; использовать встроенные сериализаторы нельзя;
    }

    static Basket loadFromTxtFile(File textFile) {
        //статический(!) метод восстановления объекта корзины из текстового файла, в который ранее была она сохранена;
    }

    static Basket saveBin (File file) {

    }

    static Basket loadFromBinFile(File file) {
        //для загрузки корзины из бинарного файла.
    }
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