package com.tianyue.zk;

import org.apache.zookeeper.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class ZookeeperClient {

    private ZooKeeper zookeeperClient = null;
    private String connectString = "hadoop102:2181,hadoop103:2181,hadoop104:2181";
    private int sessionTimeout = 2000;

    @Before
    public void init() throws IOException {
       ZooKeeper zookeeperClient = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
           @Override
           public void process(WatchedEvent watchedEvent) {

           }
       });
    }


    @Test
    public void CreateNode()
    {
        String nodeCreated =  zookeeperClient.create("/atguigu",
                "shuaige".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
                createMode.PERSISTENT );
    }

}
