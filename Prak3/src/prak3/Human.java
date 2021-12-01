package prak3;

public class Human {
    private Head head;
    private Hand left_hand;
    private Hand right_hand;
    private Leg left_leg;
    private Leg right_leg;
    private Torso torso;

    public Human(Head head, Hand left_hand, Hand right_hand, Leg left_leg, Leg right_leg, Torso torso)
    {
        this.head = new Head(head.getColor());
        this.left_hand = new Hand(left_hand.isWriting_hand());
        this.right_hand = new Hand(right_hand.isWriting_hand());
        this.left_leg = new Leg(left_leg.getSize());
        this.right_leg = new Leg(right_leg.getSize());
        this.torso = new Torso(torso.getSize_waist());
    }

    public void change_Head(Head head)
    {
        this.head.setColor(head.getColor());
    }

    public void change_left_Hand(Hand left_hand)
    {
        this.left_hand.setWriting_hand(left_hand.isWriting_hand());
    }

    public void change_right_Hand(Hand right_hand)
    {
        this.right_hand.setWriting_hand(right_hand.isWriting_hand());
    }

    public void change_left_Leg(Leg left_leg)
    {
        this.left_leg.setSize(left_leg.getSize());
    }
    public void change_right_Leg(Leg right_leg)
    {
        this.right_leg.setSize(right_leg.getSize());
    }
    public void change_Torso(Torso torso) {
        this.torso.setSize_waist(torso.getSize_waist());
    }

    public Head getHead()
    {
        return head;
    }

    public Hand getLeft_hand()
    {
        return left_hand;
    }

    public Hand getRight_hand()
    {
        return right_hand;
    }

    public Leg getLeft_leg()
    {
        return left_leg;
    }

    public Leg getRight_leg()
    {
        return right_leg;
    }

    public Torso getTorso()
    {
        return torso;
    }

    public String toString()
    {
        String str = "";
        if(left_hand.isWriting_hand()) str = "left";
        if(right_hand.isWriting_hand()) str = "right";
        return "Human has one head with hair color " + this.getHead().getColor() + " The writing hand is " + str + " size of the left leg is "
                + left_leg.getSize() + " size of the right leg is " + right_leg.getSize() + " and the size of waist is " + torso.getSize_waist();
    }
}
