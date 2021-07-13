/**
 * Justin Baraniuk
 */
import java.util.Scanner;

public class AbstractBinaryTreeDriver {

	public static void main(String[] args) {
		LinkedBinaryTree<String> tree = new LinkedBinaryTree<>();
		Position<String> p1 = tree.addRoot("Do you wanna order a pizza with me? (yes/no)");
		Position<String> p2 = tree.addLeft(p1, "Aww.. maybe next time.");
		p2 = tree.addRight(p1, "Do you want meat on the pizza? (yes/no)");
		tree.addLeft(p2, "Let's get the Garden Special on whole wheat.");
		p1 = tree.addRight(p2, "Do you like pineapple? (yes/no)");
		tree.addLeft(p1, "Let's go for the Deluxe.");
		tree.addRight(p1,  "I'll order us one extra-large Hawaiian.");

		Scanner kb = new Scanner(System.in);
		String answer;
		p1 = tree.root();
		
		// first question from tree
		System.out.println(p1);

		while (!tree.isExternal(p1)) {
			answer = kb.next();
		
			if (answer.equals("no")) 
				p1 = tree.left(p1);	
			else 
				p1 = tree.right(p1);

			System.out.println(p1);
		}
		System.out.println("\n*************\nProgram ended\n*************");
	}
}
