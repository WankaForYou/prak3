package prak3;

public class Prak3_1 {
    public static void main(String[] args)
    {
        Circle circle = new Circle(3, 1, "red", 5);
        circle.setPoint(4, 2);
        System.out.println(circle);

        Book book = new Book(567, 1999, "margaret", "the sun");
        book.setNum_pages(600);
        System.out.println(book);

        Head head = new Head("brown");
        Hand left_hand = new Hand(true);
        Hand right_hand = new Hand(false);
        Leg left_leg =new Leg(41);
        Leg right_leg = new Leg((42));
        Torso torso = new Torso(80);
        Human human = new Human(head, left_hand, right_hand, left_leg, right_leg, torso);
        System.out.println(human);
    }
}
