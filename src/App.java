/**
 * PullUntilRare
 * Name: ____________________
 * Date: ____________________
 *
 * AI Use Tier: 🤝 AI Co-Pilot
 * AI Attribution (required if you used AI): ____________________
 */
public class App
{
    public static void main(String[] args)
    {
        PullMachine machine = new PullMachine();

        // ===== TODO 1: Pull Until Rare =====
        // Pull until you get a rare item. Count how many pulls it took.
        // Loop I'm using: while  Why: Don't know how many times to pull

        int pullsToRare = 0;

        while (machine.pullItem() != true){
            machine.pullItem();
            pullsToRare++;
        }


        System.out.println("Part 1: It took " + pullsToRare + " pulls to get a rare item.");

        // ===== TODO 2: Exactly 100 Pulls =====
        // Pull exactly 100 times. Count how many were rare.
        // Loop I'm using: For  Why: Fixed amount of loop

        int rareCount = 0;

        for (int o = 0; o < 100; machine.pullItem()) {
            if (machine.pullItem() == true){
                rareCount++;
            }
            o++;
        }


        System.out.println("Part 2: In 100 pulls, you got " + rareCount + " rare items.");

        // ===== TODO 3: Reflection =====
        // Run your program at least 5 times first. Then answer below in
        // complete sentences. Use these words somewhere: iteration,
        // condition, loop control variable (or counter).
        //
        // 1. Why does a while loop fit Part 1 and a for loop fit Part 2?
        //    What would go wrong if you swapped them?
        //    Answer: I learned a while back these two loops are interchangeable and you can use it for each others purpose, but you have to make the conditions a little different.
        //    Though for simplicity these loops should be used as is because it's kind of hard to formatt it differently.
        //
        // 2. How did your five runs compare to each other? What surprised you?
        //    Answer:The fact my 100 tries can get less than 5 items, yet it can also get more than 5 dispite the 5%
        //
        // 3. Describe one bug or wrong turn you hit and how you fixed it.
        //    (No bugs? Explain how you checked that your counter was correct.)
        //    Answer: The 1st todo had an error where you could get a rare item in 0 pulls
        //
        // 4. A 5% chance can feel very different depending on how it's
        //    presented. Who benefits when players keep pulling, and who
        //    might be harmed?
        //    Answer: Right now it seems to just benifit the player for having fun and harms them because of the amount of time they spend.
        //    Though, turning this into a money making game the person who makes it benefits per pull while the user is harmed financially and addiction wise.
    }
}
