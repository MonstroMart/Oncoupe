/*
 * Copyright 2017-2018 Francis Chabot
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.franksuselessworld.oncoupe;

import javax.swing.*;

/**
 * <h1>Oncoupe</h1>
 *
 * <p>Oncoupe (Wecut) is a non-destructive video editor having
 * the ability to make simple changes to video files without transcoding them.</p>
 *
 * <p>Here's a list of the features offered by Oncoupe :</p>
 *
 * <ul>
 *     <li>cutting</li>
 *     <li>splitting</li>
 *     <li>joining (video files must have the same resolution and encoding parameters)</li>
 *     <li>cropping</li>
 *     <li>rotating</li>
 *     <li>flipping</li>
 *     <li>muxing</li>
 *     <li>demuxing</li>
 * </ul>
 *
 * @author  Francis Chabot
 * @version 0.1.0
 */
public class Oncoupe {
    private JButton openBtn;
    private JPanel mainWindow;

    public Oncoupe() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Oncoupe");
        frame.setContentPane(new Oncoupe().mainWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}