
public class Main {
    public static void main(String[] args) throws Exception {

        //Mis abuelos por parte de padre
        var juan = new Person(null, null, GENDER.MALE, "Juan Bello Mallou");
        var mercedes = new Person(null, null, GENDER.FEMALE, "Mercedes Segade ?");

        //Mis abuelos por parte de madre
        var francisco = new Person(null, null, GENDER.MALE, "Francisco Iglesias(? ?");
        var carmen = new Person(null, null, GENDER.FEMALE, "Carmen Bustelo(? ?");

        //Mis padres
        var alberto = new Person(mercedes, juan, GENDER.MALE, "Alberto Bello Segade");
        var amparo = new Person(carmen, francisco, GENDER.FEMALE, "Amparo Iglesias Bustelo");

        var me = new Person(amparo, null, GENDER.MALE, "Alejandro Bello Iglesias");
        var dru = new Person(amparo, alberto, GENDER.MALE, "Rubén Bello Iglesias");

        PersonRelationFinder finder = new PersonRelationFinder();

        System.out.println(finder.findSiblings(me));
        

    }

}
