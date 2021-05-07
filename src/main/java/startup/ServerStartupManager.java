package startup;

import store.ClientDataStore;

public class ServerStartupManager {

    //Instead use spring initializer
    static {
        ClientDataStore.initialize();
        //same way with hotel data store
    }
}
