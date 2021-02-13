package andytxr.ldrplugins;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Random;

public class CommandBlessed implements CommandExecutor {

    public HashMap<String, Long> cooldown = new HashMap<String, Long>();


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        int cooldownsec = 60;
        if(cooldown.containsKey(sender.getName())) {
            long secondsLeft = ((cooldown.get(sender.getName())/1000)+cooldownsec) - (System.currentTimeMillis()/1000);
            if(secondsLeft>0) {
                sender.sendMessage(ChatColor.DARK_RED+"Voce nao pode pedir a bencao por "+ChatColor.WHITE + secondsLeft + ChatColor.DARK_RED+" segundos!");
                return true;
            }
        }
        cooldown.put(sender.getName(), System.currentTimeMillis());

        if(sender instanceof Player)
        {
            Random random = new Random();
            ItemStack[] item = new ItemStack[] {new ItemStack(Material.ANVIL), new ItemStack(Material.BEDROCK), new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.GHAST_TEAR), new ItemStack(Material.WHITE_BED), new ItemStack(Material.COAL), new ItemStack(Material.BAKED_POTATO), new ItemStack(Material.CHAINMAIL_CHESTPLATE), new ItemStack(Material.OAK_BOAT), new ItemStack(Material.STONE), new ItemStack(Material.OAK_SIGN)};
            p.getInventory().addItem(item[random.nextInt(item.length-1)]);
            p.sendMessage(ChatColor.DARK_AQUA+"A sua bencao foi dada! Agradeca a Lana!");
        }

        return true;
    }

}
