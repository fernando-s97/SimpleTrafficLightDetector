
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.core;


// C++: class TickMeter
//javadoc: TickMeter

public class TickMeter {
    
    protected final long nativeObj;
    
    //javadoc: TickMeter::TickMeter()
    public TickMeter() {
        
        nativeObj = TickMeter_0();
        
        return;
    }
    
    // C++:   TickMeter()
    private static native long TickMeter_0();
    
    //
    // C++:   TickMeter()
    //
    
    protected TickMeter(long addr) {
        nativeObj = addr;
    }
    
    
    //
    // C++:  double getTimeMicro()
    //
    
    public long getNativeObjAddr() {
        return nativeObj;
    }
    
    
    //
    // C++:  double getTimeMilli()
    //
    
    //javadoc: TickMeter::getTimeMicro()
    public double getTimeMicro() {
        
        double retVal = getTimeMicro_0(nativeObj);
        
        return retVal;
    }
    
    
    //
    // C++:  double getTimeSec()
    //
    
    // C++:  double getTimeMicro()
    private static native double getTimeMicro_0(long nativeObj);
    
    
    //
    // C++:  int64 getCounter()
    //
    
    //javadoc: TickMeter::getTimeMilli()
    public double getTimeMilli() {
        
        double retVal = getTimeMilli_0(nativeObj);
        
        return retVal;
    }
    
    
    //
    // C++:  int64 getTimeTicks()
    //
    
    // C++:  double getTimeMilli()
    private static native double getTimeMilli_0(long nativeObj);
    
    
    //
    // C++:  void reset()
    //
    
    //javadoc: TickMeter::getTimeSec()
    public double getTimeSec() {
        
        double retVal = getTimeSec_0(nativeObj);
        
        return retVal;
    }
    
    
    //
    // C++:  void start()
    //
    
    // C++:  double getTimeSec()
    private static native double getTimeSec_0(long nativeObj);
    
    
    //
    // C++:  void stop()
    //
    
    //javadoc: TickMeter::getCounter()
    public long getCounter() {
        
        long retVal = getCounter_0(nativeObj);
        
        return retVal;
    }
    
    // C++:  int64 getCounter()
    private static native long getCounter_0(long nativeObj);
    
    //javadoc: TickMeter::getTimeTicks()
    public long getTimeTicks() {
        
        long retVal = getTimeTicks_0(nativeObj);
        
        return retVal;
    }
    
    // C++:  int64 getTimeTicks()
    private static native long getTimeTicks_0(long nativeObj);
    
    //javadoc: TickMeter::reset()
    public void reset() {
        
        reset_0(nativeObj);
        
        return;
    }
    
    // C++:  void reset()
    private static native void reset_0(long nativeObj);
    
    //javadoc: TickMeter::start()
    public void start() {
        
        start_0(nativeObj);
        
        return;
    }
    
    // C++:  void start()
    private static native void start_0(long nativeObj);
    
    //javadoc: TickMeter::stop()
    public void stop() {
        
        stop_0(nativeObj);
        
        return;
    }
    
    // C++:  void stop()
    private static native void stop_0(long nativeObj);
    
    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }
    
    // native support for java finalize()
    private static native void delete(long nativeObj);
    
}
