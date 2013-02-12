public class PhraseOMatic {
    public static void main(String[] args){
        String[] wordListOne = {"24/7", "Impressive", "Kittens", "Quality", "Unbelivable"};
        String[] wordListTwo = {"Support", "Coverage", "Expertise"};
        String[] wordListThree = {"everyday", "at no coast to you", "for free", "natively", "made in USA", "soft and purring", "lizards...everywhere", "mission"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);


    }//end main
} //end class
