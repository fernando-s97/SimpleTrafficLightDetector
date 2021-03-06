
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;


// C++: class ParamGrid
//javadoc: ParamGrid

public class ParamGrid {
    
    protected final long nativeObj;
    
    protected ParamGrid(long addr) {
        nativeObj = addr;
    }
    
    //javadoc: ParamGrid::create(minVal, maxVal, logstep)
    public static ParamGrid create(double minVal, double maxVal, double logstep) {
        
        ParamGrid retVal = new ParamGrid(create_0(minVal, maxVal, logstep));
        
        return retVal;
    }
    
    //
    // C++: static Ptr_ParamGrid create(double minVal = 0., double maxVal = 0., double logstep = 1.)
    //
    
    // C++: static Ptr_ParamGrid create(double minVal = 0., double maxVal = 0., double logstep = 1.)
    private static native long create_0(double minVal, double maxVal, double logstep);
    
    //javadoc: ParamGrid::create()
    public static ParamGrid create() {
        
        ParamGrid retVal = new ParamGrid(create_1());
        
        return retVal;
    }
    
    
    //
    // C++: double ParamGrid::minVal
    //
    
    private static native long create_1();
    
    
    //
    // C++: void ParamGrid::minVal
    //
    
    public long getNativeObjAddr() {
        return nativeObj;
    }
    
    
    //
    // C++: double ParamGrid::maxVal
    //
    
    //javadoc: ParamGrid::get_minVal()
    public double get_minVal() {
        
        double retVal = get_minVal_0(nativeObj);
        
        return retVal;
    }
    
    
    //
    // C++: void ParamGrid::maxVal
    //
    
    //javadoc: ParamGrid::set_minVal(minVal)
    public void set_minVal(double minVal) {
        
        set_minVal_0(nativeObj, minVal);
        
        return;
    }
    
    
    //
    // C++: double ParamGrid::logStep
    //
    
    // C++: void ParamGrid::minVal
    private static native void set_minVal_0(long nativeObj, double minVal);
    
    
    //
    // C++: void ParamGrid::logStep
    //
    
    // C++: double ParamGrid::minVal
    private static native double get_minVal_0(long nativeObj);
    
    //javadoc: ParamGrid::get_maxVal()
    public double get_maxVal() {
        
        double retVal = get_maxVal_0(nativeObj);
        
        return retVal;
    }
    
    //javadoc: ParamGrid::set_maxVal(maxVal)
    public void set_maxVal(double maxVal) {
        
        set_maxVal_0(nativeObj, maxVal);
        
        return;
    }
    
    // C++: void ParamGrid::maxVal
    private static native void set_maxVal_0(long nativeObj, double maxVal);
    
    // C++: double ParamGrid::maxVal
    private static native double get_maxVal_0(long nativeObj);
    
    //javadoc: ParamGrid::get_logStep()
    public double get_logStep() {
        
        double retVal = get_logStep_0(nativeObj);
        
        return retVal;
    }
    
    //javadoc: ParamGrid::set_logStep(logStep)
    public void set_logStep(double logStep) {
        
        set_logStep_0(nativeObj, logStep);
        
        return;
    }
    
    // C++: void ParamGrid::logStep
    private static native void set_logStep_0(long nativeObj, double logStep);
    
    // C++: double ParamGrid::logStep
    private static native double get_logStep_0(long nativeObj);
    
    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }
    
    // native support for java finalize()
    private static native void delete(long nativeObj);
    
}
