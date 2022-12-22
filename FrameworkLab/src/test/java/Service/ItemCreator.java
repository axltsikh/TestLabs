package Service;

import Model.Item;

public class ItemCreator {
    private static final String SHIRT_NAME="test.SHIRT_NAME";
    private static final String FULL_SHIRT_NAME="test.FULL_SHIRT_NAME";
    private static final String SHIRT_PRICE="test.SHIRT_PRICE";
    private static final String SHIRT_COLOUR="test.SHIRT_COLOUR";
    private static final String SHIRT_SIZE="test.SHIRT_SIZE";
    private static final String SHORT_NAME="test.SHORT_NAME";
    private static final String SHORT_PRICE="test.SHORT_PRICE";
    private static final String SHORT_COLOUR="test.SHORT_COLOUR";
    private static final String SHORT_SIZE="test.SHORT_SIZE";
    private static final String SHORT_SIZE_XL="test.SHORT_SIZE_XL";
    public static Item createShorts(){
        return new Item(TestDataReader.getTestData(SHORT_NAME),
                TestDataReader.getTestData(SHORT_PRICE),
                TestDataReader.getTestData(SHORT_COLOUR),
                TestDataReader.getTestData(SHORT_SIZE));
    }
    public static Item createXLShorts(){return new Item(TestDataReader.getTestData(SHORT_NAME)
            ,TestDataReader.getTestData(SHORT_PRICE)
            ,TestDataReader.getTestData(SHORT_COLOUR)
            ,TestDataReader.getTestData(SHORT_SIZE_XL));}
    public static Item createShirt(){
        return new Item(TestDataReader.getTestData(SHIRT_NAME)
                ,TestDataReader.getTestData(SHIRT_PRICE)
                ,TestDataReader.getTestData(SHIRT_COLOUR)
                ,TestDataReader.getTestData(SHIRT_SIZE));
    }
    public static Item createShirtWithFullName(){
        return new Item(TestDataReader.getTestData(FULL_SHIRT_NAME)
                ,TestDataReader.getTestData(SHIRT_PRICE)
                ,TestDataReader.getTestData(SHIRT_COLOUR),
                TestDataReader.getTestData(SHIRT_SIZE));
    }
}
