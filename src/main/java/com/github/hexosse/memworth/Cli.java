/*
 * Copyright 2015 Hexosse
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.hexosse.memworth;

import org.apache.commons.cli.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This file is part of MemWorth
 *
 * @author <b>hexosse</b> (<a href="https://github.com/hexosse">hexosse on GitHub</a>).
 */
public class Cli
{
    private static final Logger log = Logger.getLogger(Cli.class.getName());
    private String[] args = null;
    private Options options = new Options();

    private String csvFile = "Minecraft Economy Manager.csv";
    private String ymlFile = "worth.yml";
    private boolean useName = true;

    /**
     * @param args args fom main class
     */
    public Cli(String[] args)
    {
        this.args = args;

        options.addOption("h", "help", false, "show help.");
        options.addOption(Option.builder("c")
                .longOpt("csv")
                .hasArg()
                .optionalArg(true)
                .desc("MEM input csv file")
                .build());
        options.addOption(Option.builder("w")
                .longOpt("worth")
                .hasArg()
                .optionalArg(true)
                .desc("output worth file")
                .build());
        options.addOption(Option.builder("n")
                .longOpt("name")
                .desc("Use item name instead of item id")
                .build());
        options.addOption(Option.builder("i")
                .longOpt("id")
                .desc("Use item id instead of item name")
                .build());
    }


    /**
     * @return Cli
     */
    public Cli parse()
    {
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;

        try
        {
            cmd = parser.parse(options, args);

            if(cmd.hasOption("h")) help();
            if(cmd.hasOption("c")) csvFile = cmd.getOptionValue("c");
            if(cmd.hasOption("w")) ymlFile = cmd.getOptionValue("w");
            if(cmd.hasOption("n")) useName = true;
            if(cmd.hasOption("i")) useName = false;


        } catch(ParseException e)
        {
            log.log(Level.SEVERE, "Failed to parse comand line properties", e);
            help();
        }
        return this;
    }

    /**
     *
     */
    private void help()
    {
        // This prints out some help
        HelpFormatter formater = new HelpFormatter();

        formater.printHelp("MemWorth", options);
        System.exit(0);
    }

    public String getCsvFileName()
    {
        return csvFile;
    }

    public String getYmlFile()
    {
        return ymlFile;
    }

    public boolean getUseName() {
        return useName;
    }
}
