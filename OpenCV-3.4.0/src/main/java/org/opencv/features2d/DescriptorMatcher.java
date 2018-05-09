
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.features2d;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfDMatch;
import org.opencv.utils.Converters;

import java.util.ArrayList;
import java.util.List;

// C++: class DescriptorMatcher
//javadoc: DescriptorMatcher

public class DescriptorMatcher extends Algorithm {
    
    public static final int
            FLANNBASED = 1,
            BRUTEFORCE = 2,
            BRUTEFORCE_L1 = 3,
            BRUTEFORCE_HAMMING = 4,
            BRUTEFORCE_HAMMINGLUT = 5,
            BRUTEFORCE_SL2 = 6;
    
    
    protected DescriptorMatcher(long addr) {
        super(addr);
    }
    
    
    //
    // C++:  Ptr_DescriptorMatcher clone(bool emptyTrainData = false)
    //
    
    //javadoc: DescriptorMatcher::create(descriptorMatcherType)
    public static DescriptorMatcher create(String descriptorMatcherType) {
        
        DescriptorMatcher retVal = new DescriptorMatcher(create_0(descriptorMatcherType));
        
        return retVal;
    }
    
    // C++: static Ptr_DescriptorMatcher create(String descriptorMatcherType)
    private static native long create_0(String descriptorMatcherType);
    
    
    //
    // C++: static Ptr_DescriptorMatcher create(String descriptorMatcherType)
    //
    
    //javadoc: DescriptorMatcher::create(matcherType)
    public static DescriptorMatcher create(int matcherType) {
        
        DescriptorMatcher retVal = new DescriptorMatcher(create_1(matcherType));
        
        return retVal;
    }
    
    
    //
    // C++: static Ptr_DescriptorMatcher create(int matcherType)
    //
    
    // C++: static Ptr_DescriptorMatcher create(int matcherType)
    private static native long create_1(int matcherType);
    
    
    //
    // C++:  bool empty()
    //
    
    //javadoc: DescriptorMatcher::clone(emptyTrainData)
    public DescriptorMatcher clone(boolean emptyTrainData) {
        
        DescriptorMatcher retVal = new DescriptorMatcher(clone_0(nativeObj, emptyTrainData));
        
        return retVal;
    }
    
    
    //
    // C++:  bool isMaskSupported()
    //
    
    // C++:  Ptr_DescriptorMatcher clone(bool emptyTrainData = false)
    private static native long clone_0(long nativeObj, boolean emptyTrainData);
    
    
    //
    // C++:  vector_Mat getTrainDescriptors()
    //
    
    //javadoc: DescriptorMatcher::clone()
    public DescriptorMatcher clone() {
        
        DescriptorMatcher retVal = new DescriptorMatcher(clone_1(nativeObj));
        
        return retVal;
    }
    
    
    //
    // C++:  void add(vector_Mat descriptors)
    //
    
    private static native long clone_1(long nativeObj);
    
    
    //
    // C++:  void clear()
    //
    
    //javadoc: DescriptorMatcher::empty()
    public boolean empty() {
        
        boolean retVal = empty_0(nativeObj);
        
        return retVal;
    }
    
    
    //
    // C++:  void knnMatch(Mat queryDescriptors, Mat trainDescriptors, vector_vector_DMatch& matches, int k, Mat mask = Mat(), bool compactResult = false)
    //
    
    // C++:  bool empty()
    private static native boolean empty_0(long nativeObj);
    
    //javadoc: DescriptorMatcher::isMaskSupported()
    public boolean isMaskSupported() {
        
        boolean retVal = isMaskSupported_0(nativeObj);
        
        return retVal;
    }
    
    
    //
    // C++:  void knnMatch(Mat queryDescriptors, vector_vector_DMatch& matches, int k, vector_Mat masks = vector_Mat(), bool compactResult = false)
    //
    
    // C++:  bool isMaskSupported()
    private static native boolean isMaskSupported_0(long nativeObj);
    
    //javadoc: DescriptorMatcher::getTrainDescriptors()
    public List<Mat> getTrainDescriptors() {
        List<Mat> retVal = new ArrayList<Mat>();
        Mat retValMat = new Mat(getTrainDescriptors_0(nativeObj));
        Converters.Mat_to_vector_Mat(retValMat, retVal);
        return retVal;
    }
    
    
    //
    // C++:  void match(Mat queryDescriptors, Mat trainDescriptors, vector_DMatch& matches, Mat mask = Mat())
    //
    
    // C++:  vector_Mat getTrainDescriptors()
    private static native long getTrainDescriptors_0(long nativeObj);
    
    //javadoc: DescriptorMatcher::add(descriptors)
    public void add(List<Mat> descriptors) {
        Mat descriptors_mat = Converters.vector_Mat_to_Mat(descriptors);
        add_0(nativeObj, descriptors_mat.nativeObj);
        
        return;
    }
    
    
    //
    // C++:  void match(Mat queryDescriptors, vector_DMatch& matches, vector_Mat masks = vector_Mat())
    //
    
    // C++:  void add(vector_Mat descriptors)
    private static native void add_0(long nativeObj, long descriptors_mat_nativeObj);
    
    //javadoc: DescriptorMatcher::clear()
    public void clear() {
        
        clear_0(nativeObj);
        
        return;
    }
    
    
    //
    // C++:  void radiusMatch(Mat queryDescriptors, Mat trainDescriptors, vector_vector_DMatch& matches, float maxDistance, Mat mask = Mat(), bool compactResult = false)
    //
    
    // C++:  void clear()
    private static native void clear_0(long nativeObj);
    
    //javadoc: DescriptorMatcher::knnMatch(queryDescriptors, trainDescriptors, matches, k, mask, compactResult)
    public void knnMatch(Mat queryDescriptors, Mat trainDescriptors, List<MatOfDMatch> matches, int k, Mat mask, boolean compactResult) {
        Mat matches_mat = new Mat();
        knnMatch_0(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, k, mask.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        matches_mat.release();
        return;
    }
    
    
    //
    // C++:  void radiusMatch(Mat queryDescriptors, vector_vector_DMatch& matches, float maxDistance, vector_Mat masks = vector_Mat(), bool compactResult = false)
    //
    
    // C++:  void knnMatch(Mat queryDescriptors, Mat trainDescriptors, vector_vector_DMatch& matches, int k, Mat mask = Mat(), bool compactResult = false)
    private static native void knnMatch_0(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, int k, long mask_nativeObj, boolean compactResult);
    
    //javadoc: DescriptorMatcher::knnMatch(queryDescriptors, trainDescriptors, matches, k)
    public void knnMatch(Mat queryDescriptors, Mat trainDescriptors, List<MatOfDMatch> matches, int k) {
        Mat matches_mat = new Mat();
        knnMatch_1(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, k);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        matches_mat.release();
        return;
    }
    
    
    //
    // C++:  void read(FileNode arg1)
    //
    
    // Unknown type 'FileNode' (I), skipping the function
    
    
    //
    // C++:  void read(String fileName)
    //
    
    private static native void knnMatch_1(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, int k);
    
    
    //
    // C++:  void train()
    //
    
    //javadoc: DescriptorMatcher::knnMatch(queryDescriptors, matches, k, masks, compactResult)
    public void knnMatch(Mat queryDescriptors, List<MatOfDMatch> matches, int k, List<Mat> masks, boolean compactResult) {
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        knnMatch_2(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, k, masks_mat.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        matches_mat.release();
        return;
    }
    
    
    //
    // C++:  void write(Ptr_FileStorage fs, String name = String())
    //
    
    // Unknown type 'Ptr_FileStorage' (I), skipping the function
    
    
    //
    // C++:  void write(String fileName)
    //
    
    // C++:  void knnMatch(Mat queryDescriptors, vector_vector_DMatch& matches, int k, vector_Mat masks = vector_Mat(), bool compactResult = false)
    private static native void knnMatch_2(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, int k, long masks_mat_nativeObj, boolean compactResult);
    
    //javadoc: DescriptorMatcher::knnMatch(queryDescriptors, matches, k)
    public void knnMatch(Mat queryDescriptors, List<MatOfDMatch> matches, int k) {
        Mat matches_mat = new Mat();
        knnMatch_3(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, k);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        matches_mat.release();
        return;
    }
    
    private static native void knnMatch_3(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, int k);
    
    //javadoc: DescriptorMatcher::match(queryDescriptors, trainDescriptors, matches, mask)
    public void match(Mat queryDescriptors, Mat trainDescriptors, MatOfDMatch matches, Mat mask) {
        Mat matches_mat = matches;
        match_0(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, mask.nativeObj);
        
        return;
    }
    
    // C++:  void match(Mat queryDescriptors, Mat trainDescriptors, vector_DMatch& matches, Mat mask = Mat())
    private static native void match_0(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, long mask_nativeObj);
    
    //javadoc: DescriptorMatcher::match(queryDescriptors, trainDescriptors, matches)
    public void match(Mat queryDescriptors, Mat trainDescriptors, MatOfDMatch matches) {
        Mat matches_mat = matches;
        match_1(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj);
        
        return;
    }
    
    private static native void match_1(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj);
    
    //javadoc: DescriptorMatcher::match(queryDescriptors, matches, masks)
    public void match(Mat queryDescriptors, MatOfDMatch matches, List<Mat> masks) {
        Mat matches_mat = matches;
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        match_2(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, masks_mat.nativeObj);
        
        return;
    }
    
    // C++:  void match(Mat queryDescriptors, vector_DMatch& matches, vector_Mat masks = vector_Mat())
    private static native void match_2(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, long masks_mat_nativeObj);
    
    //javadoc: DescriptorMatcher::match(queryDescriptors, matches)
    public void match(Mat queryDescriptors, MatOfDMatch matches) {
        Mat matches_mat = matches;
        match_3(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj);
        
        return;
    }
    
    private static native void match_3(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj);
    
    //javadoc: DescriptorMatcher::radiusMatch(queryDescriptors, trainDescriptors, matches, maxDistance, mask, compactResult)
    public void radiusMatch(Mat queryDescriptors, Mat trainDescriptors, List<MatOfDMatch> matches, float maxDistance, Mat mask, boolean compactResult) {
        Mat matches_mat = new Mat();
        radiusMatch_0(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, maxDistance, mask.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        matches_mat.release();
        return;
    }
    
    // C++:  void radiusMatch(Mat queryDescriptors, Mat trainDescriptors, vector_vector_DMatch& matches, float maxDistance, Mat mask = Mat(), bool compactResult = false)
    private static native void radiusMatch_0(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, float maxDistance, long mask_nativeObj, boolean compactResult);
    
    //javadoc: DescriptorMatcher::radiusMatch(queryDescriptors, trainDescriptors, matches, maxDistance)
    public void radiusMatch(Mat queryDescriptors, Mat trainDescriptors, List<MatOfDMatch> matches, float maxDistance) {
        Mat matches_mat = new Mat();
        radiusMatch_1(nativeObj, queryDescriptors.nativeObj, trainDescriptors.nativeObj, matches_mat.nativeObj, maxDistance);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        matches_mat.release();
        return;
    }
    
    private static native void radiusMatch_1(long nativeObj, long queryDescriptors_nativeObj, long trainDescriptors_nativeObj, long matches_mat_nativeObj, float maxDistance);
    
    //javadoc: DescriptorMatcher::radiusMatch(queryDescriptors, matches, maxDistance, masks, compactResult)
    public void radiusMatch(Mat queryDescriptors, List<MatOfDMatch> matches, float maxDistance, List<Mat> masks, boolean compactResult) {
        Mat matches_mat = new Mat();
        Mat masks_mat = Converters.vector_Mat_to_Mat(masks);
        radiusMatch_2(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, maxDistance, masks_mat.nativeObj, compactResult);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        matches_mat.release();
        return;
    }
    
    // C++:  void radiusMatch(Mat queryDescriptors, vector_vector_DMatch& matches, float maxDistance, vector_Mat masks = vector_Mat(), bool compactResult = false)
    private static native void radiusMatch_2(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, float maxDistance, long masks_mat_nativeObj, boolean compactResult);
    
    //javadoc: DescriptorMatcher::radiusMatch(queryDescriptors, matches, maxDistance)
    public void radiusMatch(Mat queryDescriptors, List<MatOfDMatch> matches, float maxDistance) {
        Mat matches_mat = new Mat();
        radiusMatch_3(nativeObj, queryDescriptors.nativeObj, matches_mat.nativeObj, maxDistance);
        Converters.Mat_to_vector_vector_DMatch(matches_mat, matches);
        matches_mat.release();
        return;
    }
    
    private static native void radiusMatch_3(long nativeObj, long queryDescriptors_nativeObj, long matches_mat_nativeObj, float maxDistance);
    
    //javadoc: DescriptorMatcher::read(fileName)
    public void read(String fileName) {
        
        read_0(nativeObj, fileName);
        
        return;
    }
    
    // C++:  void read(String fileName)
    private static native void read_0(long nativeObj, String fileName);
    
    //javadoc: DescriptorMatcher::train()
    public void train() {
        
        train_0(nativeObj);
        
        return;
    }
    
    // C++:  void train()
    private static native void train_0(long nativeObj);
    
    //javadoc: DescriptorMatcher::write(fileName)
    public void write(String fileName) {
        
        write_0(nativeObj, fileName);
        
        return;
    }
    
    // C++:  void write(String fileName)
    private static native void write_0(long nativeObj, String fileName);
    
    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }
    
    // native support for java finalize()
    private static native void delete(long nativeObj);
    
}
