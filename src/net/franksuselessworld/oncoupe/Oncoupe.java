/*
 * Copyright 2017-2018 Francis Chabot
 *
 * This file is part of Oncoupe <https://github.com/MonstroMart/Oncoupe>.
 *
 * Oncoupe is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Oncoupe is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Oncoupe. If not, see <http://www.gnu.org/licenses/>.
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
    private JButton playBtn;
    private JButton stopBtn;
    private JButton fbBtn;
    private JButton ffBtn;
    private JPanel playerWindow;

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