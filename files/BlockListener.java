package <yourname>.<pluginname>;

import org.bukkit.event.block.BlockListener;

/**
 * <pluginname> block listener
 * @author <yourname>
 */
public class <pluginname>BlockListener extends BlockListener {
    private final <pluginname> plugin;

    public <pluginname>BlockListener(final <pluginname> plugin) {
        this.plugin = plugin;
    }

    //put all Block related code here
}
