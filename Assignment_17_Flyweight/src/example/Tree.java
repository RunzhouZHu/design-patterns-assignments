package example;

public class Tree {
    private boolean isLeafy;
    private TreeImage treeImage;

    public Tree(TreeImage treeImage) {
        // This constructor is important! Note that there is no creation of Image object here.
        this.treeImage = treeImage;
        this.isLeafy = false;
    }

    public boolean isLeafy() {
        return isLeafy;
    }
    public void makeLeafy(TreeImage treeImage) {
        this.isLeafy = true;
        this.treeImage = treeImage;
    }

    public TreeImage getTreeImage() {
        return treeImage;
    }
}
