package java1.과제제출.개인과제.ch2_배열활용;

import java.util.Scanner;

public class 포켓몬스터 {

    public static void main(String[] args) {
              
              Scanner scanner = new Scanner(System.in);
              /* 몬스터 배열*/
              String[] mon = new String[5];
              mon[0]="╭ ⁀ ⁀ ╮\r\n"
                    +"( ˘▾˘　　)\r\n"
                    +"╰ ‿ ‿ ╯";
              
                    
              mon[1]="╭◜◝ ͡ ◜◝╮\r\n"
                    +"( ＊•◡•＊ )\r\n"
                    +"╰◟◞ ͜ ◟◞╯";
                 
              mon[2]="(> ” ” <)\r\n"
                    +"( =’o'= )\r\n"
                    +"-(,,)-(,,)";
              
              mon[3]="ニ|\r\n"
                    + "ニ|∧,,∧\r\n"
                    + "ニ(・ω・;）\r\n"
                    + "ニと　 )\r\n"
                    + "ニと_ノ\r\n"
                    + "ニ|";
              
              mon[4]=" ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⡴⠒⠚⣻⠇⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠓⠒⠒⠒⠒⢤⣤⠴⠚⠉⠀⡸⠁⣠⠞⠁⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⣠⠖⠋⠀⠀⠀⠀⢀⡧⠞⠣⠤⣀⡀⠀⠀⠀⠀\r\n"
                       + "⢀⣤⠔⠒⠚⣏⠉⠉⠉⠉⠉⠉⠉⠒⠒⠲⠤⠒⠋⠉⠉⠉⠉⠉⠒⠒⠻⢴⠋⠀⠀⠀⠀⠀⣠⠔⠋⠀⠀⠀⠀⠀⠉⠑⠲⢤⡀\r\n"
                       + "⠈⠙⠒⠤⢄⣘⣦⡀⠀⠀⠀⠀⠀⠀⡔⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⠤⠖⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠈⢉⣿⣗⡒⠒⠒⡾⠁⣠⣶⠒⡆⠀⠀⠀⠀⠀⠀⠀⣀⣄⡀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠞⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⢠⡎⠀⠀⠙⢦⣀⠇⠀⠻⣼⡿⠁⠀⠀⢠⡄⠀⠀⠸⣷⣼⣷⠀⢸⣆⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠋⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠈⣏⠀⠀⠀⠀⡿⠖⠲⣄⠀⠀⣤⡀⢀⣤⣀⠀⠀⢀⠈⠋⠁⠀⢸⣿⡉⠓⠦⣀⡀⠀⠀⠀⠀⢀⡴⠁⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⢹⡀⠀⠀⠀⡇⠀⠀⣸⠀⠀⢸⣯⠟⠛⠛⢿⣿⠋⠀⢰⠟⠉⠹⡇⢷⠀⠀⠀⠉⠓⠦⣄⣠⠎⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠹⡦⠴⠋⠀⠀⠀⢹⡄⠀⢀⡼⠁⠀⠀⣇⠀⠀⢠⡇⣀⣧⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄⠀⠀⠀⠙⢆⠀⠀⠀⠀⠀⠹⠤⠋⠀⠀⠀⠀⠈⠓⡶⠋⠙⠳⠤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡄⠀⠀⠀⠀⠑⠶⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⠖⠋⠀⠀⠀⠀⠀⠀⠉⠲⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣶⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡀⠀⠀⠀⠀⠀⠀⢀⣷⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠤⣤⠤⠴⠒⠒⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⡰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⡆⢀⣠⠤⠒⠒⠒⠂⠀⠀⠐⠒⠒⠒⠒⠲⢦⡀⠀⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                       + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⣿⡟⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠒⠾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
              
              String[] player = new String[6];
              
              
              String[] skill = new String[6];
              skill[0]="몸통박치기(필살기)";skill[1]="난동부리기"; skill[2]="이판사판태클";
              skill[3]="하이드로펌프"; skill[4]="메가드레인"; skill[5]="회오리불꽃";
              
                    
              player[0]= ". 👩🏼‍🦲\r\n"
                       +"_/||\\_\r\n"
                       +"_/ \\_";
              int count =0;  int pcount =0;
              int m_hp=100;
              int p_hp=100;  
              int p_heat;
              int m_heat=20;
              
              
              boolean game=true;
              while(game)   {
                    System.out.println("■■■■■■■■■■■포켓몬스터■■■■■■■■■■■");
                    System.out.println("라운드 시작합니다!!");
                    System.out.println("난 몬스터!! 체력:" +( m_hp+(count*100)) );
                    System.out.println(mon[count]);
                    System.out.println();
                     System.out.println("      vs     ");
                     System.out.println(player[pcount]);
                     System.out.println("\t\t 난 플레이어!! 체력" + p_hp);
                     
                     System.out.println("1.찌르기 2. "+skill[pcount]);
                      System.out.println("■■■■■■■■■■■당신의 선택은■■■■■■■■■■■");
                      int btn=scanner.nextInt();
                      
                      while(true) {
                         if(btn==1) {
                             p_heat = (int)(Math.random()*20+10);
                             System.out.println(p_heat + " 데미지를 입혔습니다.");
                             m_hp -= p_heat; 
                             if(m_hp+(count*100)>0) {
                                System.out.println("몬스터 차례입니다.");
                                System.out.println("몬스터가"+ m_heat +"데미지를 입혔습니다.");
                                   p_hp -= m_heat; 
                                   
                                  
                                  if(p_hp>0) {break;}
                                  
                                  ///////////// 내가 죽음
                                  else if(p_hp<=0) {
                                   System.out.println("죽었습니다.");
                                   System.out.println("부활합니다.");
                                   
                                   for(int i=1; i<player.length; i++) {
                                       if(player[i]==null) {
                                           System.out.println("!!!!!!!");
                                           System.out.println("!!!!!!!");
                                           System.out.println("!!!!!!!");
                                            break;
                                         }
                                       
                                       //죽었을 때 주머니에 누가 있으면 대타 등장
                                       else if(player[i]!=null) {
                                           pcount++;
                                           System.out.println("★★★★★★대타 등장★★★★★★");
                                           //대타 다 죽으면 졸라맨으로 돌아가기
                                           if(player[pcount]==null) {
                                              pcount = 0;
                                           }
                                           break;
                                        }
                                     }
                                   p_hp=100; break;
                                }
                             }
                             
                             ////////////////// 잡음 
                             else if(m_hp+(count*100)<=0) {
                                System.out.println("약해진 몬스터를 잡았습니다.");
                                for(int i = 1 ; i<=count+1; i++) {
                                   player[i]=mon[i-1];
                                }
                                if(count==4) {
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   System.out.println("피카츄를 잡았습니다!!");
                                   System.out.println("다른 게임에서 만나요~~");
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   game=false;
                                   break;
                                }
                                System.out.println("앞으로 이 친구를 부를 수 있습니다.");
                                System.out.println(player[count+1]);
                                p_hp=100; m_hp=100;
                                count++;
                                pcount=0;
                                 break;
                             }
                         }
                         
                         else if(btn==2) {
                             p_heat = (int)(Math.random()*20+50);
                             System.out.println(p_heat + " 데미지를 입혔습니다.");
                             m_hp -= p_heat; 
                             if(m_hp+(count*100)>0) {
                                System.out.println("몬스터 차례입니다.");
                                System.out.println("몬스터가"+ m_heat +"데미지를 입혔습니다.");
                                   p_hp -= m_heat; 
                                   
                                  
                                  if(p_hp>0) {break;}
                                  
                                  ///////////// 내가 죽음
                                  else if(p_hp<=0) {
                                   System.out.println("죽었습니다.");
                                   System.out.println("부활합니다.");
                                   
                                   for(int i=1; i<player.length; i++) {
                                       if(player[i]==null) {
                                           System.out.println("!!!!!!!");
                                           System.out.println("!!!!!!!");
                                           System.out.println("!!!!!!!");
                                            break;
                                         }
                                       
                                       //주머니에 누가 있으면 대타 등장
                                       else if(player[i]!=null) {
                                           pcount++;
                                           System.out.println("★★★★★★대타 등장★★★★★★");                                         
                                           //대타 다 죽으면 졸라맨으로 돌아가기
                                           if(player[pcount]==null) {
                                              pcount = 0;
                                           }
                                           System.out.println(count);
                                           break;
                                        }
                                     }
                                   p_hp=100;  break;
                                }
                             }
                             
                             ////////////////// 잡음 
                             else if(m_hp+(count*100)<=0) {
                                System.out.println("약해진 몬스터를 잡았습니다.");
                                for(int i = 1 ; i<=count+1; i++) {
                                   player[i]=mon[i-1];
                                }
                                if(count==4) {
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   System.out.println("피카츄를 잡았습니다!!");
                                   System.out.println("다른 게임에서 만나요~~");
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   System.out.println("■■■■■■■■■■■■■■■■■■■■■■");
                                   game=false;
                                   break;
                                }
                                System.out.println("앞으로 이 친구를 부를 수 있습니다.");
                                System.out.println(player[count+1]);
                                p_hp=100; m_hp=100;
                                count++;
                                pcount=0;
                                 break;
                                 
                             }
                         }
                         else {System.out.println("다시 입력해주세요!"); break;}
                         
                      }// while end      
                         
              }//while end
              
              
           }//main e


}