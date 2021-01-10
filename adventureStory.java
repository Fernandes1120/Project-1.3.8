import java.util.Random;
import java.util.Scanner;
/*
 * 
 * Name(s): Aidan Fernandes, Oliver Deng, Zeicheng Wang
 * Date: 1/9/2021
 * Class: AP CSA (Mrs. Woldseth)
 * Project: Choose Your Path [Using Boolean Expressions]
 * 
 */
public class adventureStory {

	public static void main(String[] args) {
		/*
		 * TODO:
		 * Create story
		 * Input prints to guide the user as they progress
		 * Using boolean statements, allow the user to choose different paths
		 * Create an alternate ending for each story based on their original choice
		 */
		Scanner playerChoice1 = new Scanner(System.in); 
		System.out.println("User, if you are seeing this, the emergency generator has diverted power to this terminal. Something is terrible wrong with this shuttle (Shuttle_DSA119201) and requires immidiate repair \nCalculating... \nUser, you have three choices. The first two have been provided via shuttle protocol,\ntype and enter \"reboot\" if you would like to manually override the admins control and repair the ship. The second option also provided by the shuttle protocal is escape pod. Please ensure \nall eligible members make it abord before departing. If you choose to eject using escape pod, enter \"escape\". Your third and final option is to accept an incoming transmission that has \nnot yet been authorized or recognized by our system. If you accept, please enter \"transmission\"");

		int selection = 0;
		
		do {
			String firstChoice = playerChoice1.nextLine();
			if(firstChoice.equalsIgnoreCase("reboot")) {
				selection = 1;
			}else if(firstChoice.equalsIgnoreCase("escape")) {
				selection = 2;
			}else if(firstChoice.equalsIgnoreCase("transmission")) {
				selection = 3;
			}else {
				selection = 0;
				System.out.println("Invalid input, try again (hint: ensure their are no spaces before, after, or in between your input)");
			}
		} while(selection == 0);

		// Little fun story feature, the "power level" is randomly 1-11
		
		Random compChoice = new Random();
		int chosen = 0;
		for(int counter=1; counter<=1; counter++) {
			chosen = 1+compChoice.nextInt(9);
		}
		
		//story endings 1 and 2 as follows:
		
		if((selection != 2) && (selection != 3)) {
			System.out.println("You chose reboot...initiating protocol. Success. Warning: Power Level Critcal (" + chosen + "%). User, you have limited time. you may broadcast a distress signal to all nearby statitions, or you can \ntry steering to Venzenulon 7, an inhabitated planet with a hostile yet modern civilization. Type and enter \"signal\" if you would like to send out a distress call, or enter \"override\"");
			int story1dowhile = 0;
			do {
			Scanner playerChoice2 = new Scanner(System.in);
			String secondChoice = playerChoice2.nextLine();
			if(secondChoice.equalsIgnoreCase("signal")) {
				System.out.println("You sent out a distress signal at galactic time 15:00. After waiting for hours, someone finally recieves your signal and offers help, but you must pay. You hope that your translator might be of value, \nbut when your rescuers arive, they are displeased with your what you have to give, so they propose a counter-offer. You must preform manual labor on their ship for the entire 3 days you are \nin transit. Knowing you have no other choice, you grudgingly accept and now on your way home");
				story1dowhile = 1;
			}else if(secondChoice.equalsIgnoreCase("override")) {
				System.out.println("Loading... Override action initiated, transferring all controls to \"USER_112004\". *You now have control of all of the ships capabilities, of which are little to none due to the damage. You \nmanage to steer towards Venzenulon 7 and engange backup thrusters when suddenly, you notice escorts jump out of hyperspace. They are armed and deadly, and they are sending over a \ntransmission encoded with the seal of the emperor. If you do not immidiatley engage them, they will fire upon you, so you accpet.* They order you to provide all of your intergalactic \ncredentials and provide you with a landing port in \"Sector 4\". Prepare for boarding upon your landing.");
				story1dowhile = 2;
			}
			}while(story1dowhile == 0);
		}
			
			//story endings 2 and 3 as follows:
			
			if((selection != 1) && (selection != 3)) {
			System.out.println("You chose the escape pod. Preparing engines. System online - CRITICAL FAILURE - \"Power Cell Not Found\". Incoming transmission. User, the escape pods have suffered a fatal system 32 flaw. \nIt seems we have detected yet another transmission inside the shuttle from the same source as the first, do you accept? If so, type and enter \"accept\", or you can deny the transmission \nby entering \"dismiss\"");
			int story2dowhile = 0;
			do {
			Scanner playerChoice3 = new Scanner(System.in);
			String thirdChoice = playerChoice3.nextLine();
			if(thirdChoice.equalsIgnoreCase("accept")) {
				System.out.println("The aliens slowly draw your ship into their space port. You equip yourself with the newly invented uni-breather, allowing you to breath on virtually any planet, and confront the aliens. \nWithout warning, they begin scouring your ship without notice. Fearing for the worst, you oversee them but say nothing as they did take you in without charge. They come out empty handed, \none preforming a notion or movement to another, and they begin showing you to your quarters however, you never told them your intentions. You take a step into your new room when the door \nslams shut and locks. \"Was it a trap? Did they find something? Am I in danger?\". You begin questioning your actions. By now, you are no longer aware of how much time has passed, and \nthe food supply built into your suit is declining. All hope is lost until an abrupt bang shakes the entire ship. You can hear blaster fire and loud yelling. Is it a rescue, or a death sentance?");
				story2dowhile = 1;
			}else if(thirdChoice.equalsIgnoreCase("dismiss")) {
				System.out.println("You chose to deny their trasmission. The terminal updates. \"User, replacement battery cell can be located in rear cargo hold\". You find the power cell and insert it into the engine. The \nterminal updates once more. \"User, System load successful, beginning escape pod protocal, please enter the escape pod within the next 60 seconds\". Finally, relieved that your escape pod \nis functional, you gather any remaining resources and depart as fast as you can. Almost too good to be true. Turned out it was. About 30 minutes into your travels, you notice your Galactic \nPositioning System is going haywire and you are decreasing in speed, as if you were being caught in some trap. Then you see it through the forefront transparent panel, an imperial cruiser. \nEach one comes with the latest generation tractor beams, and the cruiser themselves are miles long. You prepare for the worst, and begin shutting down all power consuming devices to midigate \nany chances of them finding you.");
				story2dowhile = 2;
			}
			}while(story2dowhile == 0);
			//final story endings 3 and 4 as follows:
		}else if((selection != 1) && (selection != 2)){
			System.out.println("You chose to accept the transmission. *The foreign entity communicates to you in an unkown language, but luckily you have a translator that was given to you pre-flight. After waiting \nfor the translation to process, you learn that these aliens are willing to collect your ship and allow you aboard theirs...so long as you obey their command. \nEnter \"accept_offer\" or \"decline\"");
			int story3dowhile = 0;
			do {
			Scanner playerChoice4 = new Scanner(System.in);
			String fourthChoice = playerChoice4.nextLine();
			if(fourthChoice.equalsIgnoreCase("accept_offer")) {
				System.out.println("You accept their proposal. The aliens are beginning to board you once they have your shuttle within their hangar bay. Using your uni-breather, the aliens confront you, asking if you \nhave aboard any contraband. You reply hesitantly \"no\" becase you do not want to reveal your true intentions of your travels. The aliens escort you into their ship and introduce you \nto your captain. But then the universe stopped, for you saw someone you hadent seen in years. Your Father. You are speechless. You stare at each other in disbelief. Finally he steps \nforward and offers a hug to which you hugged back in a heartbeat. It has been so long, so many things to talk about, \"where have you been all this time?\". He replies all in due time. \nJust as things seem to be going well, a strange buzzing noise begins to alert the crew. Something is wrong, and your Father quickly attends to the main control panel. You offer to help, \nbut he insists everything is fine. That sounded familiar. Nonetheless, you approach him and realize the situation you are in. Galatic Emperial Space. Dozens of fighters begin detactching \nfrom a nearby Imperial station and engage your fathers ship. We don't stand a chance, and you relay that to your father, and he reluctantly agrees. He surrenders his ship to the \nemperials for the best chance at survival. What would happen next?");
				story3dowhile = 1;
			}else if(fourthChoice.equalsIgnoreCase("decline")) {
				System.out.println("You decline their offer, because they do not specify their command. They insist you join them, but you disable the terminal communicator. Suprisingly, they leave without any defiance. \nYou realize you may have just turned down your only chance at survival, but theres also the emergency distress signal. Just as you are about to activate it, the terminal begins blaring \n\"WARNING WARNING WARNING - UNAUTHORIZED SHUTTLE BREACH\" You do not know what to do in this situation, so you surrender your terminal abilities to the mysterious breachers. Maybe this is \nwhy the aliens left in the first place. The rear door begins to open, you draw the closest object near you resembeling a weapon. 3 tall figures quielty begin entering your shuttle. \nhey then make an audible but indistinguishable sound. Did they find you?. Well, you are in desperate circumstances, and decide you're better off alerting them of your presense. You \nannounce your status as ship commander. then they turn around quicly and open fire. You take cover. Is this the end? Clearly they are hostile, and you have nowhere else to go.");
				story3dowhile = 2;
			}
			}while(story3dowhile == 0);
		
		}
		
		
	
		
	}
}
