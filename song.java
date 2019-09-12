//This program prints a song with a cumulative (or increasing) section

import java.util.*;

class song{
	 
	public static void main(String args[]){
		LinkedList<String> lines = new LinkedList<String>();
		
		//Prints fly stanza, adds lines to increasing section of song
		System.out.println("There was an old woman who swallowed a fly.");
		lines.add("");
		lines.add(0,"Perhaps she'll die.");
		lines.add(0,"I don't know why she swallowed that fly,");
		songPlayer(lines);
		
		//Prints spider stanza, adds line to increasing section of song
		System.out.println("There was an old woman who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		lines.add(0,"She swallowed the spider to catch the fly,");
		songPlayer(lines);
		
		//Prints bird stanza, adds line to increasing section of song
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		lines.add(0,"She swallowed the bird to catch the spider,");
		songPlayer(lines);
		
		//Prints cat stanza, adds line to increasing section of song
		System.out.println("There was an old woman who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		lines.add(0,"She swallowed the cat to catch the bird,");
		songPlayer(lines);
		
		//Prints dog stanza, adds line to increasing section of song
		System.out.println("There was an old woman who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		lines.add(0,"She swallowed the dog to catch the cat,");
		songPlayer(lines);
		
		//Prints bear stanza
		System.out.println("There was an old woman who swallowed a bear,");
		System.out.println("Without a care she swallowed a bear.");
		System.out.println("She swallowed the bear to catch the dog,");
		songPlayer(lines);
		
		//Prints horse stanza
		System.out.println("There was an old woman who swallowed a horse,");
		System.out.println("She died of course.");
	}
	
	//Prints increasing section of song
	public static void songPlayer(LinkedList<String> lines){
		Iterator<String> iter = lines.iterator();
			while(iter.hasNext()){
				System.out.println(iter.next());
			}
	}
}

