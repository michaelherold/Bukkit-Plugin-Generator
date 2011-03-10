package <yourname>.<pluginname>;

import org.bukkit.event.player.PlayerListener;

/**
 * Handle events for all Player related events
 * @author <yourname>
 */
public class <pluginname>PlayerListener extends PlayerListener {
    private final <pluginname> plugin;

    public <pluginname>PlayerListener(<pluginname> instance) {
        plugin = instance;
    }

    //Insert Player related code here
}

