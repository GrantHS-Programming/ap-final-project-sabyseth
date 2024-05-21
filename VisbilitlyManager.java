public class VisbilitlyManager {
    UI ui;

    public VisbilitlyManager(UI userInerface){
        ui = userInerface;
    }

    public void showTitleScreen(){
        ui.titleNamePanal.setVisible(true);
        ui.startButtonPanal.setVisible(true);
    }
}
