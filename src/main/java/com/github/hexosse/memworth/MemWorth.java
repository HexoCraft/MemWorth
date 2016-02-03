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

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * This file is part of MemWorth
 *
 * @author <b>hexosse</b> (<a href="https://github.com/hexosse">hexosse on GitHub</a>).
 */
public class MemWorth
{
    private static Cli cli;
    public static File csvFile;
    public static File ymlFile;

    public static void main(String[] args)
    {
        // Parse command line
        cli = new Cli(args).parse();

        // Test if the csv file exist
        csvFile = new File(cli.getCsvFileName());
        if(!csvFile.exists())
        {
            System.out.println("Error: " + csvFile.getName() + " not found!");
            System.out.println("Use MemWorth -h for help");
            System.exit(0);
        }

        // Parse csv file and generate worth data
        WorthBuilder wb = new WorthBuilder(cli.getCsvFileName());
        String yaml = wb.parse().toYaml(cli.getUseName());

        // Write yaml data to file
        ymlFile = new File(cli.getYmlFile());
        if (!ymlFile.delete()) {
            System.out.println("Error deleting " + ymlFile.getName() + " file.");
        }

        try {
            PrintWriter writer = new PrintWriter(ymlFile, "UTF-8");
            writer.println(yaml);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // The End
        System.exit(0);
    }
}
