/**
 * PullMachine simulates a loot box or gacha machine.
 * Each pull has a small chance of giving a rare item.
 *
 * You do NOT need to change this file. Your job is to USE it.
 */
public class PullMachine
{
    private double rareChance;

    // Creates a machine with a 5% chance of a rare item
    public PullMachine()
    {
        rareChance = 0.05;
    }

    // Creates a machine with a custom chance (0.10 = 10%)
    public PullMachine(double chance)
    {
        rareChance = chance;
    }

    // Simulates ONE pull.
    // Returns true if the item was rare, false if it was common.
    public boolean pullItem()
    {
        return Math.random() < rareChance;
    }
}
