package com.example.kim.breaktimeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by Kim on 9/27/2016.
 */
public class TicTacToeGame extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button playBtn;
    boolean end;
    int turn;

    String sb1, sb2, sb3, sb4, sb5, sb6, sb7, sb8, sb9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tictactoe_layout);

        playBtn = (Button) findViewById(R.id.btnPlay);

        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);

        setEnableButtons();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                    }
                }
                checkGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                    }
                }
                checkGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                    }
                }
                checkGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                    }
                }
                checkGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                    }
                }
                checkGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                    }
                }
                checkGame();

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                    }
                }
                checkGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                    }
                }
                checkGame();

            }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                    }
                }
                checkGame();
            }
        });

        // --------Play Button -----------

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

                turn = 1;
                end = false;
                setEnableButtons();
                playBtn.setEnabled(false);
            }
        });

        // --------- Back Button ------------

    }

    public void checkGame() {

        sb1 = b1.getText().toString();
        sb2 = b2.getText().toString();
        sb3 = b3.getText().toString();
        sb4 = b4.getText().toString();
        sb5 = b5.getText().toString();
        sb6 = b6.getText().toString();
        sb7 = b7.getText().toString();
        sb8 = b8.getText().toString();
        sb9 = b9.getText().toString();

        // For player X
        if (sb1.equals("X") && sb2.equals("X") && sb3.equals("X")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player X won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }

        if (sb4.equals("X") && sb5.equals("X") && sb6.equals("X")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player X won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }

        if (sb7.equals("X") && sb8.equals("X") && sb9.equals("X")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player X won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }

        if (sb1.equals("X") && sb4.equals("X") && sb7.equals("X")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player X won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }

        if (sb2.equals("X") && sb5.equals("X") && sb8.equals("X")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player X won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }

        if (sb3.equals("X") && sb6.equals("X") && sb9.equals("X")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player X won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }

        if (sb1.equals("X") && sb5.equals("X") && sb9.equals("X")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player X won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }

        if (sb3.equals("X") && sb5.equals("X") && sb7.equals("X")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player X won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }


        // for player O
        if (sb1.equals("O") && sb2.equals("O") && sb3.equals("O")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player O won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }
        if (sb1.equals("O") && sb5.equals("O") && sb9.equals("O")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player O won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }
        if (sb1.equals("O") && sb4.equals("O") && sb7.equals("O")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player O won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }
        if (sb2.equals("O") && sb5.equals("O") && sb8.equals("O")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player O won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }
        if (sb3.equals("O") && sb6.equals("O") && sb9.equals("O")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player O won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }
        if (sb7.equals("O") && sb8.equals("O") && sb9.equals("O")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player O won !!! ", Toast.LENGTH_SHORT).show();

            exitGame();
        }
        if (sb4.equals("O") && sb5.equals("O") && sb6.equals("O")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player O won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }

        if (sb3.equals("O") && sb5.equals("O") && sb7.equals("O")) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Player O won !!! ", Toast.LENGTH_SHORT).show();
            exitGame();
        }

        if (sb1 != "" && sb2 != "" && sb3 != "" && sb4 != "" && sb5 != "" && sb6 != "" && sb7 != "" &&
                sb8 != "" && sb9 != "" && end == false) {
            frozenButton();
            Toast.makeText(TicTacToeGame.this, "Go Back And Play Again !!! ", Toast.LENGTH_SHORT).show();
            exitGame();

        }

    }

    public void exitGame() {
        end = false;
        playBtn.setEnabled(true);

    }

    public void frozenButton() {
        if (sb1 == "") b1.setEnabled(false);
        if (sb2 == "") b2.setEnabled(false);
        if (sb3 == "") b3.setEnabled(false);
        if (sb4 == "") b4.setEnabled(false);
        if (sb5 == "") b5.setEnabled(false);
        if (sb6 == "") b6.setEnabled(false);
        if (sb7 == "") b7.setEnabled(false);
        if (sb8 == "") b8.setEnabled(false);
        if (sb9 == "") b9.setEnabled(false);
    }

    public void setEnableButtons() {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
    }
}
