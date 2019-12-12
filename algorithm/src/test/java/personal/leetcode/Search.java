package personal.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author malujia
 * @create 12-09-2019 下午4:23
 *
 * todo
 *  查找的对象是谁
 *  结束的条件是什么
 *
 *  二叉搜索
 *  warning
 *      1. 数组下标容易出错
 *      2. 有时使用 while(i<=j)，这里需要判断 i==j 并 break 的情况， 否则会造成死循环。
 **/

public class Search {
    @Test
    public void testEle(){
        int[] nums = {378497,792477,8832,732953,25956,326180,806102,248627,827417,895216,259724,387767,212052,382454,909332,68029,895121,14845,450015,651393,192518,231604,929163,942737,424455,587784,448753,926732,991977,157010,123039,289557,285610,543819,982091,267671,126143,72892,315566,833783,894006,210725,580699,948754,152477,970821,135749,673081,418240,758108,209422,495906,965298,847549,379009,370354,827391,269167,376530,717031,841680,770942,895107,223692,450202,526348,859609,52582,12419,841569,176203,69465,31556,637767,797030,39566,734081,807109,396504,123224,512512,614881,957216,799867,809085,185628,452830,295967,997350,322821,116445,810719,592714,180709,973353,73316,435648,240582,28894,75646,687022,300947,107953,502950,527710,452974,893250,893066,336778,434763,603824,41347,563825,311156,391054,716154,101936,425710,716491,205610,744366,403690,312145,84901,629022,216070,299631,968581,845814,39170,672773,693317,903476,416092,403532,238338,227203,566402,600016,971780,121337,822431,292603,980047,453868,59660,776584,292582,611730,37211,620760,812131,213435,319648,134896,281711,841350,44340,3082,852965,499616,926646,303094,195955,152457,957956,935163,378482,139922,370466,690059,265180,149813,594420,436733,597746,170287,815395,196300,613128,466782,11394,525802,418465,560991,9947,682958,823350,572882,805441,458206,659608,570453,495430,75732,295383,509302,470981,703854,221954,179942,252849,246081,815605,503450,332321,153887,514913,971944,248218,684640,594452,547173,122335,422541,984583,357170,796719,656970,868093,422011,238335,759002,590160,880447,498991,58923,902644,80586,813483,52339,118163,722813,345965,636277,977006,100240,293332,931485,764074,97041,267373,828018,536158,867391,972932,898852,682806,75099,457785,488828,82322,475579,116642,264981,421474,117452,300202,357761,617794,62425,429810,352533,100562,734118,287062,945303,763229,225745,635016,511039,985291,692572,221832,188325,227401,736771,27276,470079,279542,660403,375938,355657,218789,284183,434152,252486,162802,828227,656481,62880,60488,269365,243315,373360,719810,865545,556954,882319,166139,178406,692617,244111,807468,971737,821986,653712,105802,993312,409928,646491,561651,354083,831421,275023,397182,201090,33615,575330,224906,840995,282644,807707,587912,142219,554509,990639,876353,515864,409711,930445,914382,965507,149198,530228,209963,941519,97411,304712,152906,218363,133745,975824,552859,872242,274332,92265,127628,954399,768414,655019,565910,193073,33242,484142,373027,623249,964124,767809,250116,324569,612243,793142,589443,757160,195735,270580,900168,590291,330527,518189,164863,914935,641250,379067,664527,551163,848873,746705,305075,51037,113542,13923,657637,524088,30624,619905,528295,947626,939478,432972,431014,438447,803139,195334,996871,401247,489023,640844,678598,29556,940545,856739,735643,40212,260091,492469,213532,27212,748229,138637,14081,997827,467081,354331,212095,617738,95673,609425,216392,162272,529485,491342,701557,934883,385230,406715,568538,855615,354599,37636,67518,201565,156760,608518,845798,819573,388673,304417,520285,230818,717621,75535,473882,487108,647912,426964,162274,585138,840480,181077,928519,46726,211580,579112,498583,904596,954792,46165,100416,650363,762196,983332,155475,17921,775525,522653,905171,568188,447777,365880,804959,953738,595522,958493,363947,474286,241238,230606,205226,694042,53803,412625,404178,481222,908114,373059,920554,57775,871990,579537,659313,495228,74450,298798,939774,784752,857749,533150,103356,754981,929090,417204,198073,59539,39584,757548,770971,537579,399739,865589,301495,260205,181992,733734,314014,723544,634551,149544,297165,463574,261335,609685,230524,490984,556916,487405,854240,918385,576265,542545,315209,141785,696892,851980,559835,991929,554833,275796,93671,307662,829375,326534,842041,482805,244016,803936,736374,592371,219325,610112,464852,969710,519065,561945,744201,201780,338531,917047,34761,691227,357114,552665,957832,393481,43347,127727,531757,919479,86203,537658,364795,158096,780307,683398,42131,190662,6127,314453,527698,321907,350672,210680,320573,183881,598007,368214,899901,571713,56231,544291,835844,109334,867043,643184,261729,822178,59849,626807,188088,775003,265418,997624,124858,404926,276,610134,340940,303910,279747,683757,960730,274104,467074,299111,497473,945077,842371,250035,484936,572272,29941,800062,895246,925841,27802,234295,517096,549289,440354,784943,929913,530198,554891,771841,485211,212874,784435,297842,786221,776200,937165,156254,243407,428769,229899,435152,867036,706662,71304,90183,625241,619204,640652,150823,165015,189957,475444,617066,556324,156152,500708,154422,82074,423649,105669,31683,840809,635379,155146,517578,355782,573916,165209,5470,878591,771283,232382,664608,570572,503235,535423,175640,129259,847756,400678,620576,791362,651796,863321,436015,825556,24196,790603,242651,248391,491313,34671,433516,516605,114280,336653,579185,914298,524187,261533,726714,92804,292385,817004,267695,266416,470354,896340,856824,769888,751771,591895,420713,335944,682968,174082,605464,494332,206561,89615,535193,967096,773866,578178,326056,249378,534880,711948,378661,865864,800444,487819,412166,129692,783348,139098,579221,318033,147336,822473,350487,358991,995388,953549,928156,997741,433123,594617,454048,911916,515886,871000,154143,624094,668251,260782,687538,141342,583832,831231,237436,916297,292226,683310,739386,863085,705182,514828,832597,679979,738370,910404,765299,764479,472948,781945,393675,794853,381212,193150,298397,713186,11040,995100,165907,602969,112901,39313,981566,673732,916470,807383,695136,73507,995952,375692,233535,544022,509385,890009,402372,545327,563187,568079,205023,991059,785505,571036,83222,706495,670840,980571,384601,493629,585535,202757,747710,434885,606486,679796,819160,835780,824270,649586,640938,241197,449481,825401,5473,774956,751814,466794,444360,851271,985246,343726,977237,660409,564774,327391,266425,265716,813999,690186,330806,751778,782675,10592,588408,472520,626068,956655,126299,822095,686110,11514,692276,770225,34245,37366,497984,187632,180051,322602,214404,526649,613097,761710,442320,641576,956613,964383,199614,917593,960953,422236,155161,915112,70134,955720,707001,64657,461250,76974,704042,70898,942017,308131,47560,5613,834961,96704,530794,80604,250498,682133,25562,636921,528159,405524,949454,954561,6212,149568,697849,158031,213422,151762,990862,917079,933001,110184,361352,119957,81648,181888,312943,241565,416408,341016,482396,140624,412285,883399,54488,987168,85082,392240,970995,331743,273171,195705,98444,378117,947667,637678,338328,454279,664888,93168,714881,46656,219027,486659,700537,896459,894762,966654,462624,442814,912029,331675,835011,673071,212478,980055,153329,593483,879078,368520,943298,91203,716207,942689,606301,165755,665133,487183,355790,138116,565308,412393,534169,537408,585373,617663,745876,730579,889568,722017,341370,447547,826958,573584,979210,70446,684537,102946,445805,832741,757315,814980,644713,405832};
        int threshold= 4142;
        System.out.println(smallestDivisor(nums, threshold));
    }
    @Test
    public void test(){
        int[] nums1 = {};
        System.out.println(lengthOfLIS2(nums1));
    }
    public void testTree(){
    }

    /**
     * todo 300. Longest Increasing Subsequence (不连续的最长增长串的长度)
     * warning
     *  特点： 无序、不是连续的最长字串
     */
    /**
     * info
     *  每个元素为结尾最长的链 = 所有比他小的元素中结尾最长的链+1
     *  只有遍历它之前的元素才能找到所有比他小的元素中结尾最长的链。O(n2)
     */
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;
        int[] lengths = new int[nums.length];
        lengths[0] = 1;
        int max = 1;
        for (int i=1; i<nums.length; i++){
            int idx = i-1;
            int tmpMax=0;
            while (idx > -1){
                if (nums[idx] < nums[i]){
                    if (lengths[idx] > tmpMax)
                        tmpMax = lengths[idx];
                }
                idx--;
            }
            lengths[i] = tmpMax+1;
            if (max < lengths[i])
                max = lengths[i];
        }
        return max;
    }

    /**
     * info
     *  只求长度
     *  使用一个数组保存一个有序的最长序列（这只是其中一个，并不一定是最后的那个），将后面的元素依次放入到该序列中，有可能是替换，有可能是插入到结尾。
     *  例如：
     *      1,3,2,4：
     *         1
     *         1,3
     *         1,2 #因为对于 2 后面的 4 来说，因为 2 小于 3,所以 2 替换掉 3 只能会使得链增长，不会缩短。 寻找 3这个位置就是2要替换的位置，这个位置可以使用二分查找在该有序链中查找
     *         1,2,4 # 4大于最后一个元素，所以要插入进去
     *
     */
    public int lengthOfLIS2(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = binarySearchForBigger(dp, len, num);
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }
    // 返回直接在nums中的位置
    private int binarySearchForBigger(int[] nums, int len, int num){
        if (len == 0)
            return 0;
        int i = 1;
        int j = len+1;
        while (i<j){
            int mid = (i+j)/2;
            if (nums[mid-1]>=num){
                j = mid;
            }else{
                i = mid + 1;
            }
        }
        return i-1;
    }

    /**
     * todo 4. Median of Two Sorted Arrays
     * info
     * 数学思想 + 边界条件
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] shortOne = nums1;
        int[] biggerOne = nums2;
        if (shortOne.length > biggerOne.length){
            shortOne = nums2;
            biggerOne = nums1;
        }
        int m = shortOne.length;
        int n = biggerOne.length;
        int halfLen = (m+n+1)/2;
        int startI = 1;
        int endI = m;
        int idxI ;
        int idxJ ;
        boolean isDouble = (m+n) % 2 == 0;
        if (m == 1 && n==1)
            return ((double)(shortOne[0]+biggerOne[0]))/2;
        while (startI <= endI){// 元素个数都是>1的
            idxI = (startI + endI)/2;
            idxJ = halfLen - idxI;
            if (startI == m){
                if (shortOne[startI-1] <= biggerOne[idxJ]){
                    if (m==n)
                        return ((double) shortOne[m-1] + biggerOne[0]) /2;
                    if (isDouble)
                        return ((double) Math.max(shortOne[m-1], biggerOne[idxJ-1]) + biggerOne[idxJ]) /2;
                    return Math.max(shortOne[idxI-1], biggerOne[idxJ-1]);
                }
                if (m==n)
                    return ((double) biggerOne[1] + biggerOne[0]) /2;
                if (isDouble){
                    if (m>1)
                        return ((double) Math.max(shortOne[m-2], biggerOne[idxJ-1]) + biggerOne[idxJ]) /2;
                    else
                        return ((double) Math.min(shortOne[0], biggerOne[idxJ+1]) + biggerOne[idxJ]) /2;
                }
                return biggerOne[idxJ];
            }
            if (shortOne[idxI-1] <= biggerOne[idxJ] && biggerOne[idxJ-1] <= shortOne[idxI]){
                if (isDouble)
                    return ((double) (Math.max(shortOne[idxI-1], biggerOne[idxJ-1]) + Math.min(shortOne[idxI], biggerOne[idxJ])))/2;
                return Math.max(shortOne[idxI-1], biggerOne[idxJ-1]);
            }
            if (shortOne[idxI-1] > biggerOne[idxJ]){
                endI = idxI - 1;
            }else{
                startI = idxI + 1;
            }
        }
        if (m == 1){
            idxJ = halfLen - 1;
            if (shortOne[0] >= biggerOne[idxJ]){
                if (isDouble){
                    return ((double) biggerOne[idxJ] + Math.min(biggerOne[idxJ+1], shortOne[0]))/2; // biggerOne[idxJ-1] > shortOne[idxI]， biggerOne[idxJ-1]大于所有shortone
                }
                return biggerOne[idxJ];
            }else{
                if (isDouble){
                    return ((double) biggerOne[idxJ] + Math.max(shortOne[0], biggerOne[idxJ-1]))/2;
                }
                return Math.max(shortOne[0], biggerOne[idxJ-1]);
            }
        }
        //m>1
        // biggerOne[0] > shortOne[idxI-1]
        if (startI == m){
            if (m==n){
                return ((double) (shortOne[m-1] + biggerOne[0]))/2;
            }
            idxJ = halfLen - m;
            if (isDouble){
                return ((double) biggerOne[idxJ -1] + biggerOne[idxJ])/2;
            }
            return biggerOne[idxJ-1];
        }
        //shortOne[0]> biggerOne[idxJ-1]。
        //但是不知道shortOne[0] 和 biggerOne[idxJ] 的关系
        //还要考虑shortOne为空的情况
        if (isDouble){
            if (m == n)
                return ((double) biggerOne[m-1] + shortOne[0])/2;
            else{
                /**
                 * shortOne[0]> biggerOne[idxJ-1] 但是不知道
                 */
                if (m==0)
                    return ((double) biggerOne[halfLen-1] + biggerOne[halfLen])/2;//
                return ((double) biggerOne[halfLen-1] + Math.min(shortOne[0], biggerOne[halfLen]))/2;//
            }
        }
        return biggerOne[halfLen-1];


    }
    /**
     * todo 278. First Bad Version
     * warning 整数相加防止溢出：整型的的范围：-2147483648（-231） 至2147483647（231-1）
     */
/*    public int firstBadVersion(int n) {
        int i =1, j=n;
        while (i<j){
            long value = (long)i+(long)j;
            int midx = (int)(value/2);
            if (isBadVersion(midx)){
                j = midx;
            }else {
                i = midx + 1;
            }
        }
        return j;
    }
    public boolean isBadVersion(int num){
        if (num >= 1702766719)
            return true;
        return false;
    }*/

    /**
     * todo
     *  783. Minimum Distance Between BST Nodes
     *  1. 中序遍历时所有元素都是升序的
     *  2. 相邻的元素差最小
     *
     * @return
     */
    public int minDiffInBST(TreeNode root) {
        int pre = Integer.MIN_VALUE;
        int value = Integer.MAX_VALUE;
        Stack<TreeNode> roots = new Stack<>();
        while (true){
            if (root != null){
                roots.push(root);
                root = root.left;
            }else {
                if (roots.empty())
                    break;
                root = roots.pop();
                if (root.val - pre < value){
                    value = root.val - pre;
                }
                pre = root.val;
                root = root.right;
            }
        }
        return value;
    }
    /**
     * todo
     *  1283. Find the Smallest Divisor Given a Threshold
     *                                                                      --
     *  搜索的对象： 1-1e6 中每一个整数
     *  结束的条件： downDivisor < upDivisor
     * @param nums
     * @param threshold
     * @return
     */
    public int smallestDivisor(int[] nums, int threshold) {
        //对nums排序
        int upDivisor = (int)1e6;//和<=threshold的最大值
        int divisor = 1;
        int sum =sumForDivide(divisor, nums);
        if (sum <= threshold)
            return 1;
        int downDivisor = 1;//和>threshold的最小值
        while (downDivisor < upDivisor){
            divisor= (downDivisor+upDivisor)/2;
            sum = sumForDivide(divisor, nums);
            if (sum <= threshold){
                upDivisor = divisor;//保证upDivisor不会越界
            }else {
                downDivisor = divisor + 1;
            }
        }
        return upDivisor;
    }

    public int sumForDivide(int divisor, int[] nums){
        int res = 0;
        int plus;
        for (int i:nums){
            if (i<=divisor)
                res += 1;
            else{
                plus = i/divisor;
                if (i % divisor != 0)plus+=1;
                res += plus;
            }
        }
        return res;
    }


    /**
     * todo
     *  对于排序的数据进行 二分查找
     *  复杂度：log(n)
     *                                                                          -
     *  这里的结束条件是找到 target，而不是while循环
     *
     * warning
     *  1.下标 midx 容易出错
     *  2.
     */
    public int binarySearch(int[] nums, int target) {
        int i = 1;
        int j = nums.length;
        while (i<=j){
            int midx = (i+j)/2;
            int m = nums[midx -1 ];
            if (m == target)
                return midx-1;
            if (m < target){
                i = midx + 1;
            }else {
                j = midx -1;
            }
        }
        return -1;
    }

    /**
     * todo
     *  这里寻找 >=num 的最小值，搜索的范围
     *                                             -
     *  1.下标 midx 容易出错
     *  2. i 往 j 靠近 或者 j 往 i 靠近， 所有的值都必须考虑到， j 可以访问到 nums[len-1]，i可以访问到 nums[0]。
     *      j 是 nums[mid-1]>=num 的位置， i 是 nums[mid-1]<num 的位置，只要i和j相等说明 找到了 满足nums[mid-1]>=num的最小值。
     *                                                                                                                                      -
     *  这里的结束条件是 i==j
     */
    private int binarySearchForLastBE(int[] nums, int num){
        int len = nums.length;
        if (len == 0)
            return 0;
        int i = 1;
        int j = len + 1;
        while (i<j){
            int mid = (i+j)/2;
            if (nums[mid-1]>=num){
                j = mid;
            }else{
                i = mid + 1;
            }
        }
        return i-1;
    }
}
