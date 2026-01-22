// Java Test Code

/* Prints "Hello, World!" and works! :)
void main() {
    IO.println("Hello, world!");
}
*/

/**
 * Takes a string and turns each index into a list
 *
 * @param string_number must be a string
 * @return The list of each index from string
 *
 */
List<String> listStuff (String string_number) {

//Creates new list
    List<String> newList = new ArrayList<>();

//Loops the multi digit number to extract each index into a list
    for (int i = 0; i < string_number.length(); i++ ){
        String ch = "" + (string_number.charAt(i));
        newList.add(i, ch); //does not wanna add to list (type Error?) IT WORKS NOW!!!!

    }
    return newList;}


void main() {


    Scanner input = new Scanner(System.in);

//Prompts user for input of name
    System.out.println("Enter your name: ");
    String name = input.nextLine();

//Prompts user for input of age

        System.out.println("Hello " + name + ", how old are you?");
        int age = input.nextInt();//Requires user to use ints but dont have a fix for it

//Takes info given to produce a higher number (ideally 3 digits) Yes there is a chance it may be more or less
        int number = name.length() + age;
        int luck = number * age;

        String string_number = Integer.toString(luck);

        String blah = "" + listStuff(string_number);
//Returns User's name and lucky number(s)
        String luckyInfo = name + ", your lucky numbers are " + blah + "!";

        IO.println(luckyInfo);


try {

    System.out.println("Would you like to save this to a file? (YES/NO)");
    Scanner fileInput = new Scanner(System.in);
    String fileCreation = fileInput.nextLine().toUpperCase();


    if (Objects.equals(fileCreation, "YES")) {
//Creates and writes to a new File!
        try
                (Writer writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(name + ".txt"), "UTF-8"))) { //why does this give warning??!?!
                writer.write(luckyInfo);
                System.out.println("Your information has been saved to: " + name + ".txt");
                System.out.println("Have A Great Day!");
        } catch (Exception e) {
            System.out.println();
        }
    } else if (Objects.equals(fileCreation, "NO")) {
        System.out.println("OK then just waste the extra code I wrote down :(");
    }
}
catch (Exception e) {
        System.out.println();
    }
}

//This makes 0 sense

