package sample;

public class Computer extends Player {
    private TreeNode root;

    public Computer(Game game) {
        super(game);
        root=new TreeNode();
        root.createSons();
        System.out.println(root.toString());
        for(TreeNode tn:root.getSons()){
            System.out.println(tn.toString()+"\n");
            tn.createSons();
            for(TreeNode tnn:tn.getSons()){
                System.out.println(tnn.toString()+"\n");
            }

        }
    }

    @Override
    public void selectNodeBeginning() {
        game.setTextInConsole("Computer PLAY");
        //TODO
    }

    @Override
    public void selectNodeEnd() {
        //TODO
    }
}
