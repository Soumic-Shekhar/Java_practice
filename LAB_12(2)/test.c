#include<stdio.h>
#include<stdlib.h>
#include<windows.h>
int i,j;
int main_exit;
void menu();
struct date
    {
    int day,month,year;
    };
struct registration
   {
    char name[60];
    int age;
    char address[60];
    char nationality[30];
    double phone;
    char passport_number[60];
    char ticket_number[60];
    struct date dob;
    float amt;
    struct date deposit;
    }add,upd,check,rem;




int main()
{
    char pass[11];
    char password[11]="bangladesh";
    int i=0;
    printf("\n\n\t\tEnter the password to login:");
    scanf("%s",pass);

    if (strcmp(pass,password)==0)
        {printf("\n\nPassword Match!\n");

                system("cls");
            menu();
        }
    else
        {   printf("\n\nWrong password!!\a\a\a");
            login_try:
            printf("\nEnter 1 to try again and 0 to exit:");
            scanf("%d",&main_exit);
            if (main_exit==1)
                    {

                        system("cls");
                        main();
                    }

            else if (main_exit==0)
                    {
                    system("cls");
                    close();}
            else
                    {printf("\nInvalid!");

                    system("cls");
                    goto login_try;}

        }
        return 0;
}
void menu()
{
    int choice;
    system("cls");
    //system("color 9");
    printf("\n\n\t\t\ TRAVEL MANAGEMENT SYSTEM");
    printf("\n\n\n\t\t\t WELCOME TO THE MAIN MENU ");
    printf("\n\n\t\t1.For outside of DHAKA \n\t\t2.For inside of DHAKA \n\t\t3.Places we provide service(map)\n\t\tEnter your choice:");
    scanf("%d",&choice);

    system("cls");
    switch(choice)
    {
        case 1:menu2();
        break;


    }


}
void menu2()
{
     int choice;
    system("cls");
    //system("color 9");
    printf("\n\n\t\t INSIDE DHAKA SERVICE MANAGEMENT SYSTEM");
    printf("\n\n\n\t\t\t THE MENU OF INSIDE DHAKA SERVICES");
    printf("\n\n\t\t1.Registration \n\t\t2.Update information of registration\n\t\t3.Check the details of registration\n\t\t4.Removing registration\n\t\t5.Exit\n\t\tEnter your choice:");
    scanf("%d",&choice);

    system("cls");
    switch(choice)
    {
         case 1:new_reg();
        break;
        case 2:edit1();
        break;
        case 3:details_reg();
        break;
        case 4:erase();
        break;
        case 5:close();
        break;

    }
}



void new_reg()

{
    int choice;
    FILE *ptr;

    ptr=fopen("record.txt","a+");
    account_no:
    system("cls");
    printf("\t\t\t ADD RECORD  ");
    printf("\n\n\nEnter today's date(dd/mm/yyyy): ");
    scanf("%d/%d/%d",&add.deposit.day,&add.deposit.month,&add.deposit.year);
    printf("\nEnter the passport number: ");
    scanf("%d",&check.passport_number);
    while(fscanf(ptr,"%s %s %d/%d/%d %d %s %d %lf %s %d/%d/%d",&add.passport_number,add.name,&add.dob.day,&add.dob.month,&add.dob.year,&add.age,add.address,add.nationality,&add.phone,add.ticket_number,&add.deposit.day,&add.deposit.month,&add.deposit.year)!=EOF)
    {
        if (check.passport_number==add.passport_number)
            {printf("Vehicle is already registered!");

                goto account_no;

            }
    }
    add.passport_number[60]=check.passport_number[60];
        printf("\nEnter the name:");
    scanf("%s",add.name);
    printf("\nEnter the date of birth(dd/mm/yyyy):");
    scanf("%d/%d/%d",&add.dob.day,&add.dob.month,&add.dob.year);
    printf("\nEnter the age:");
    scanf("%d",&add.age);
    printf("\nEnter the address:");
    scanf("%s",add.address);
    printf("\nEnter the nationality:");
    scanf("%s",add.nationality);
    printf("\nEnter the phone number: ");
    fflush(stdin);
    scanf("%lf",&add.phone);
    fflush(stdin);
    printf("\nType of ticket_number:");
    scanf("%s",add.ticket_number);

        fprintf(ptr,"%s %s %d/%d/%d %d %s %s %lf %s  %d/%d/%d",add.passport_number,add.name,add.dob.month,add.dob.day,add.dob.year,add.age,add.address,add.nationality,add.phone,add.ticket_number,add.deposit.month,add.deposit.day,add.deposit.year);


    fclose(ptr);
    printf("\nrecord registered successfully!");
    add_invalid:
    printf("\n\n\n\t\tEnter 1 to go to the main menu and 0 to exit:");
    scanf("%d",&main_exit);
    system("cls");
    if (main_exit==1)
        menu();
    else if(main_exit==0)
            close();
    else
        {
            printf("\nInvalid!\a");
            goto add_invalid;
        }
}
void edit1()
{
    int choice,test=0;
    FILE *old,*newrec;
    old=fopen("record.txt","r");
    newrec=fopen("new.txt","w");

    printf("\nEnter the ticket_number of the customer whose info you want to change:");
    scanf("%d",&upd.ticket_number);
    while(fscanf(old,"%s %s %d/%d/%d %d %s %s %lf %s %d/%d/%d",&add.passport_number,add.name,&add.dob.day,&add.dob.month,&add.dob.year,&add.age,add.address,add.nationality,&add.phone,add.ticket_number,&add.deposit.day,&add.deposit.month,&add.deposit.year)!=EOF)
    {
        if (add.passport_number==upd.passport_number)
        {   test=1;
            printf("\nWhich information do you want to change?\n1.Address\n2.Phone\n\nEnter your choice(1 for address and 2 for phone):");
            scanf("%d",&choice);
            system("cls");
            if(choice==1)
                {printf("Enter the new address:");
                scanf("%s",upd.address);
                fprintf(newrec,"%s %s %d/%d/%d %d %s %s %lf %s %d/%d/%d\n",add.passport_number,add.name,add.dob.day,add.dob.month,add.dob.year,add.age,upd.address,add.nationality,add.phone,add.ticket_number,add.deposit.day,add.deposit.month,add.deposit.year);
                system("cls");
                printf("Changes saved!");
                }
            else if(choice==2)
                {
                    printf("Enter the new phone number:");
                scanf("%lf",&upd.phone);
                fprintf(newrec,"%s %s %d/%d/%d %d %s %s %lf %s %d/%d/%d\n",add.passport_number,add.name,add.dob.day,add.dob.month,add.dob.year,add.age,add.address,add.nationality,upd.phone,add.ticket_number,add.deposit.day,add.deposit.month,add.deposit.year);
                system("cls");
                printf("Changes saved!");
                }

        }
        else
            fprintf(newrec,"%s %s %d/%d/%d %d %s %s %lf %s %d/%d/%d\n",add.passport_number,add.name,add.dob.day,add.dob.month,add.dob.year,add.age,add.address,add.nationality,add.phone,add.ticket_number,add.deposit.day,add.deposit.month,add.deposit.year);
    }
    fclose(old);
    fclose(newrec);
    remove("record.txt");
    rename("new.txt","record.txt");

if(test!=1)
        {   system("cls");
            printf("\nRecord not found!!\a\a\a");
            edit_invalid:
              printf("\nEnter 0 to try again,1 to return to main menu and 2 to exit:");
              scanf("%d",&main_exit);
              system("cls");
                 if (main_exit==1)

                    menu();
                else if (main_exit==2)
                    close();
                else if(main_exit==0)
                    edit1();
                else
                    {printf("\nInvalid!\a");
                    goto edit_invalid;}
        }
    else
        {printf("\n\n\nEnter 1 to go to the main menu and 0 to exit:");
        scanf("%d",&main_exit);
        system("cls");
        if (main_exit==1)
            menu();
        else
            close();
        }
}



void details_reg()
{
    FILE *ptr;
    int test=0;
    int choice;
    ptr=fopen("record.txt","r");
    printf("Do you want to check by\n1.passport_number\n2.Name\nEnter your choice:");
    scanf("%d",&choice);
    if (choice==1)
    {   printf("Enter the passport_number:");
        scanf("%d",&check.passport_number);

        while (fscanf(ptr,"%s %s %d/%d/%d %d %s %s %lf %s %d/%d/%d",&add.passport_number,add.name,&add.dob.day,&add.dob.month,&add.dob.year,&add.age,add.address,add.nationality,&add.phone,add.ticket_number,&add.deposit.day,&add.deposit.month,&add.deposit.year)!=EOF)
        {
            if(add.passport_number==check.passport_number)
            {   system("cls");
                test=1;

                printf("\nVEHICLE NO.:%d\nName:%s \nDOB:%d/%d/%d \nAge:%d \nAddress:%s \nNationality:%s \nPhone number:%.0lf \nTicket_number:%s \nDate Of Registration:%d/%d/%d\n\n",add.passport_number,add.name,add.dob.day,add.dob.month,add.dob.year,add.age,add.address,add.nationality,add.phone,
                add.ticket_number,add.deposit.day,add.deposit.month,add.deposit.year);

            }

            }
        }

    else if (choice==2)
    {   printf("Enter the name:");
        scanf("%s",&check.name);
        while (fscanf(ptr,"%s %s %d/%d/%d %d %s %s %lf %s %d/%d/%d",&add.passport_number,add.name,&add.dob.day,&add.dob.month,&add.dob.year,&add.age,add.address,add.nationality,&add.phone,add.ticket_number,&add.deposit.month,&add.deposit.day,&add.deposit.year)!=EOF)
        {
            if(strcmpi(add.name,check.name)==0)
            {   system("cls");
                test=1;
                printf("\nPassport_number.:%d\nName:%s \nDOB:%d/%d/%d \nAge:%d \nAddress:%s \nNationality:%s \nPhone number:%.0lf \nTicket_number%s \nDate Of Registration:%d/%d/%d\n\n",add.passport_number,add.name,add.dob.day,add.dob.month,add.dob.year,add.age,add.address,add.nationality,add.phone,
                add.ticket_number,add.deposit.day,add.deposit.month,add.deposit.year);

            }
        }
    }


    fclose(ptr);
     if(test!=1)
        {   system("cls");
            printf("\nRecord not found!!\a\a\a");
            see_invalid:
              printf("\nEnter 0 to try again,1 to return to main menu and 2 to exit:");
              scanf("%d",&main_exit);
              system("cls");
                 if (main_exit==1)
                    menu();
                else if (main_exit==2)
                    close();
                else if(main_exit==0)
                    details_reg();
                else
                    {
                        system("cls");
                        printf("\nInvalid!\a");
                        goto see_invalid;}
        }
    else
        {printf("\nEnter 1 to go to the main menu and 0 to exit:");
        scanf("%d",&main_exit);}
        if (main_exit==1)
        {
            system("cls");
            menu();
        }

        else
           {

             system("cls");
            close();
            }

}




void erase()
{
    FILE *old,*newrec;
    int test=0;
    old=fopen("record.txt","r");
    newrec=fopen("new.txt","w");
    printf("Enter the passport_number if you want to delete:");
    scanf("%d",&rem.passport_number);
    while (fscanf(old,"%s %s %d/%d/%d %d %s %s %lf %s %d/%d/%d",&add.passport_number,add.name,&add.dob.day,&add.dob.month,&add.dob.year,&add.age,add.address,add.nationality,&add.phone,add.ticket_number,&add.deposit.day,&add.deposit.month,&add.deposit.year)!=EOF)
   {
        if(add.passport_number!=rem.passport_number)
            fprintf(newrec,"%s %s %d/%d/%d %d %s %s %lf %s %d/%d/%d\n",add.passport_number,add.name,add.dob.day,add.dob.month,add.dob.year,add.age,add.address,add.nationality,add.phone,add.ticket_number,add.deposit.day,add.deposit.month,add.deposit.year);

        else
            {test++;
            printf("\nRecord deleted successfully!\n");
            }
   }
   fclose(old);
   fclose(newrec);
   remove("record.txt");
   rename("new.txt","record.txt");
   if(test==0)
        {
            printf("\nRecord not found!!\a\a\a");
            erase_invalid:
              printf("\nEnter 0 to try again,1 to return to main menu and 2 to exit:");
              scanf("%d",&main_exit);

                 if (main_exit==1)
                    menu();
                else if (main_exit==2)
                    close();
                else if(main_exit==0)
                    erase();
                else
                    {printf("\nInvalid!\a");
                    goto erase_invalid;}
        }
    else
        {printf("\nEnter 1 to go to the main menu and 0 to exit:");
        scanf("%d",&main_exit);
        system("cls");
        if (main_exit==1)
            menu();
        else
            close();
        }

}

void close()
{
    printf("\n\n\n\nthank you");
}


