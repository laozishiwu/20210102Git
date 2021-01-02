package com.nk.springboot.utils.mybatisGeneratorConfig;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

@Slf4j
public class MyBatisGeneratorUtil {
    public static void main(String[] args) {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        String generateFile = "C:\\IdeaProjects\\springboot\\src\\main\\resources\\generatorConfig.xml";
        File configFile = new File(generateFile);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration configuration = null;
        try{
            configuration = cp.parseConfiguration(configFile);
        }catch (Exception e){
            log.error("配置文件转换失败："+e.getMessage());
        }
        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = null;
        try{
            myBatisGenerator = new MyBatisGenerator(configuration,defaultShellCallback,warnings);
            myBatisGenerator.generate(null);
        }catch (Exception e){
            log.error("myBatisGeneratorException:"+e.getMessage());
        }

    }
}
