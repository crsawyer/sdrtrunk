/*
 * *****************************************************************************
 * Copyright (C) 2014-2023 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * ****************************************************************************
 */

// Generated by jextract

package io.github.dsheirer.source.tuner.sdrplay.api.v3_07;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
public class sdrplay_api_AgcT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("enable"),
        Constants$root.C_LONG$LAYOUT.withName("setPoint_dBfs"),
        Constants$root.C_SHORT$LAYOUT.withName("attack_ms"),
        Constants$root.C_SHORT$LAYOUT.withName("decay_ms"),
        Constants$root.C_SHORT$LAYOUT.withName("decay_delay_ms"),
        Constants$root.C_SHORT$LAYOUT.withName("decay_threshold_dB"),
        Constants$root.C_LONG$LAYOUT.withName("syncUpdate")
    );
    public static MemoryLayout $LAYOUT() {
        return sdrplay_api_AgcT.$struct$LAYOUT;
    }
    static final VarHandle enable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("enable"));
    public static VarHandle enable$VH() {
        return sdrplay_api_AgcT.enable$VH;
    }
    public static int enable$get(MemorySegment seg) {
        return (int)sdrplay_api_AgcT.enable$VH.get(seg);
    }
    public static void enable$set( MemorySegment seg, int x) {
        sdrplay_api_AgcT.enable$VH.set(seg, x);
    }
    public static int enable$get(MemorySegment seg, long index) {
        return (int)sdrplay_api_AgcT.enable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void enable$set(MemorySegment seg, long index, int x) {
        sdrplay_api_AgcT.enable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle setPoint_dBfs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("setPoint_dBfs"));
    public static VarHandle setPoint_dBfs$VH() {
        return sdrplay_api_AgcT.setPoint_dBfs$VH;
    }
    public static int setPoint_dBfs$get(MemorySegment seg) {
        return (int)sdrplay_api_AgcT.setPoint_dBfs$VH.get(seg);
    }
    public static void setPoint_dBfs$set( MemorySegment seg, int x) {
        sdrplay_api_AgcT.setPoint_dBfs$VH.set(seg, x);
    }
    public static int setPoint_dBfs$get(MemorySegment seg, long index) {
        return (int)sdrplay_api_AgcT.setPoint_dBfs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void setPoint_dBfs$set(MemorySegment seg, long index, int x) {
        sdrplay_api_AgcT.setPoint_dBfs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle attack_ms$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("attack_ms"));
    public static VarHandle attack_ms$VH() {
        return sdrplay_api_AgcT.attack_ms$VH;
    }
    public static short attack_ms$get(MemorySegment seg) {
        return (short)sdrplay_api_AgcT.attack_ms$VH.get(seg);
    }
    public static void attack_ms$set( MemorySegment seg, short x) {
        sdrplay_api_AgcT.attack_ms$VH.set(seg, x);
    }
    public static short attack_ms$get(MemorySegment seg, long index) {
        return (short)sdrplay_api_AgcT.attack_ms$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void attack_ms$set(MemorySegment seg, long index, short x) {
        sdrplay_api_AgcT.attack_ms$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle decay_ms$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("decay_ms"));
    public static VarHandle decay_ms$VH() {
        return sdrplay_api_AgcT.decay_ms$VH;
    }
    public static short decay_ms$get(MemorySegment seg) {
        return (short)sdrplay_api_AgcT.decay_ms$VH.get(seg);
    }
    public static void decay_ms$set( MemorySegment seg, short x) {
        sdrplay_api_AgcT.decay_ms$VH.set(seg, x);
    }
    public static short decay_ms$get(MemorySegment seg, long index) {
        return (short)sdrplay_api_AgcT.decay_ms$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void decay_ms$set(MemorySegment seg, long index, short x) {
        sdrplay_api_AgcT.decay_ms$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle decay_delay_ms$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("decay_delay_ms"));
    public static VarHandle decay_delay_ms$VH() {
        return sdrplay_api_AgcT.decay_delay_ms$VH;
    }
    public static short decay_delay_ms$get(MemorySegment seg) {
        return (short)sdrplay_api_AgcT.decay_delay_ms$VH.get(seg);
    }
    public static void decay_delay_ms$set( MemorySegment seg, short x) {
        sdrplay_api_AgcT.decay_delay_ms$VH.set(seg, x);
    }
    public static short decay_delay_ms$get(MemorySegment seg, long index) {
        return (short)sdrplay_api_AgcT.decay_delay_ms$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void decay_delay_ms$set(MemorySegment seg, long index, short x) {
        sdrplay_api_AgcT.decay_delay_ms$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle decay_threshold_dB$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("decay_threshold_dB"));
    public static VarHandle decay_threshold_dB$VH() {
        return sdrplay_api_AgcT.decay_threshold_dB$VH;
    }
    public static short decay_threshold_dB$get(MemorySegment seg) {
        return (short)sdrplay_api_AgcT.decay_threshold_dB$VH.get(seg);
    }
    public static void decay_threshold_dB$set( MemorySegment seg, short x) {
        sdrplay_api_AgcT.decay_threshold_dB$VH.set(seg, x);
    }
    public static short decay_threshold_dB$get(MemorySegment seg, long index) {
        return (short)sdrplay_api_AgcT.decay_threshold_dB$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void decay_threshold_dB$set(MemorySegment seg, long index, short x) {
        sdrplay_api_AgcT.decay_threshold_dB$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle syncUpdate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("syncUpdate"));
    public static VarHandle syncUpdate$VH() {
        return sdrplay_api_AgcT.syncUpdate$VH;
    }
    public static int syncUpdate$get(MemorySegment seg) {
        return (int)sdrplay_api_AgcT.syncUpdate$VH.get(seg);
    }
    public static void syncUpdate$set( MemorySegment seg, int x) {
        sdrplay_api_AgcT.syncUpdate$VH.set(seg, x);
    }
    public static int syncUpdate$get(MemorySegment seg, long index) {
        return (int)sdrplay_api_AgcT.syncUpdate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void syncUpdate$set(MemorySegment seg, long index, int x) {
        sdrplay_api_AgcT.syncUpdate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

