packagecom.liam;importjavax.swing.*;importcom.liam.Board.*;importcom.liam.TicTacToeGUI.*;publicclassCellModelextendsDefaultButtonModel{privateTicTacToeGUIGame;privateintID;privateintrow;privateintcol;publicstaticCellModelconvert(Objectinput){returninput==null?null:(CellModel)((JButton)input).getModel();}/***SetstheIDofthecell*@paramid*/publicvoidsetID(intid){ID=id;row=(int)Math.floor(ID/3);col=ID%3;}/***Setsthegameinstance*@paramgame*/publicvoidsetGame(TicTacToeGUIgame){Game=game;}publicbooleansetEnabled(CELL_STATEstate){if(state==CELL_STATE.NONE){super.setEnabled(true);returnfalse;}super.setEnabled(false);Game.GameBoard.SetCell(row,col,state);Game.State=(Game.State==GAME_STATE.O_PLAYING)?GAME_STATE.X_PLAYING:GAME_STATE.O_PLAYING;returnGame.GameBoard.CheckWin(row,col,state);}/***Resetsthecell*/publicvoidreset(){super.setEnabled(true);Game.GameBoard.SetCell(row,col,CELL_STATE.NONE);}}
