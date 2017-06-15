package com.kingnet.sy;

import org.apache.hadoop.fs.Path;

import java.io.File;

/**
 * Created by sunyue on 2017/6/7.
 */
public class Test {
    public static void main(String[] args) {
        Path dataFilePath = new Path("/home/cangjingge/kn_dataplatform/dataplatform-service-engine/data_temp", taskDto.getTask_id() + ".txt");
        File file = new File(dataFilePath.toUri().toString());
    }
}
