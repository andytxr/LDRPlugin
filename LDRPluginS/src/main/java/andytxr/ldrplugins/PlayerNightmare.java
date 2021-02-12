package andytxr.ldrplugins;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import java.util.Random;

public class PlayerNightmare implements Listener {

    @EventHandler
    public void onPlayerSleeps(PlayerBedLeaveEvent event)
    {
        Random random = new Random();
        String[] bsenten = new String[]{"Em breve sera uma dadiva conseguir dormir", "Ca entre nos, ficara dificil de voce ir dormir daqui a um tempo", "A aura esta ficando cada vez mais fraca, tome cuidado quando for dormir da proxima vez"};

        if(event.getPlayer().getLevel()>=100)
        {
            event.getPlayer().sendMessage(ChatColor.RED+"Um mal sonho te deixa sonambulo e voce fica perdido.");
            int x = random.nextInt(29999984);
            int z = random.nextInt(29999984);
            boolean negX = random.nextBoolean();
            boolean negZ = random.nextBoolean();

            if (negX) x = x * -1;
            if (negZ) z = z * -1;

            Player player = event.getPlayer();
            Location location = player.getWorld().getHighestBlockAt(x,z).getLocation();
            player.teleport(location);
            player.getInventory().clear();
        }
        else
        {
            event.getPlayer().sendMessage(ChatColor.DARK_GRAY+" "+bsenten[random.nextInt(bsenten.length-1)]);
        }

    }

}
