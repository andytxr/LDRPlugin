package andytxr.ldrplugins;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.Random;

public class CommandLocation implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        Random random = new Random();

        if(sender instanceof Player)
        {
            int x = random.nextInt(29999984);
            int z = random.nextInt(29999984);
            boolean negX = random.nextBoolean();
            boolean negZ = random.nextBoolean();

            if (negX) x = x * -1;
            if (negZ) z = z * -1;

            Player p = (Player) sender;
            Location location = p.getWorld().getHighestBlockAt(x,z).getLocation();
            p.teleport(location);
        }

        return true;
    }
}
