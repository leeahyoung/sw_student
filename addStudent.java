public static void Addstudent() throws FileNotFoundException, IOException, ClassNotFoundException{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt",true));
      System.out.println("[학생 정보 입력]");
      scan.nextLine();
      System.out.print("학번 : ");
      id = reader.readLine();

      if(i>0){
         Idcheck(id);
         s_id[i] = id2;
      }
      else{
         s_id[i] = id;
      }
      System.out.print("이름 : ");
      name[i] = scan.nextLine();
      System.out.print("학과 : ");
      department[i] = reader.readLine();
      System.out.print("전화번호 : ");
      phoneNumber[i] = reader.readLine();
      num++;
      String item = String.format("%s|%s|%s|%s\n",s_id[i],name[i],department[i],phoneNumber[i]);
      writer.write(item);
      writer.close();
      i++;
      System.out.println("학생정보가 저장되었습니다.");
   }