public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzling = new PuzzleJava();

        // TenRolls
        // System.out.println(puzzling.getTenRolls());

        // RandomeLetter
        // System.out.println(puzzling.getRandomLetter());

        // Generate Password
        // System.out.println(puzzling.generatePassword());

        // getNewPasswordSet
        System.out.println(puzzling.getNewPasswordSet(3));
        System.out.println(puzzling.getNewPasswordSet(6));
        System.out.println(puzzling.getNewPasswordSet(9));
    }
}
