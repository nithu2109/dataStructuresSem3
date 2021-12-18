#include <stdio.h>

struct process
{
	int at;
	int st;
	int pr;
	int status;
	int ft;
}ready_list[10];
int n;
int main()
{
	int i,cur_time,pid;	
	printf("Enter number of processes:");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("Process %d\n",i+1);
		printf("***********\n");
		printf("Enter Arrival Time:");
		scanf("%d",&ready_list[i].at);
		printf("Enter Service Time:");
		scanf("%d",&ready_list[i].st);
		printf("Priority (1-10):");
		scanf("%d",&ready_list[i].pr);
		ready_list[i].status=0;
	}
	i=0; cur_time=0;
	while(i < n)
	{
		pid=dispatcher(cur_time);
		ready_list[pid].ft=cur_time + ready_list[pid].st;
		ready_list[pid].status=1;
		cur_time+= ready_list[pid].st;
		i++;
	}
	printf("Process\t Arrival Time\t Service Time\t	Finish Time\n");
	printf("*******\t ************\t ************\t ***********\n");
	for(i=0;i<n;i++)
	{
		printf("%d\t\t%d\t\t%d\t\t\t%d\n",i,ready_list[i].at,ready_list[i].st,ready_list[i].ft);
	}
}
int dispatcher(int time)
{
	int i,high_pr=0,index=-1;
	for(i=0;i<n;i++)
	{
		if(ready_list[i].status != 1)
			if(ready_list[i].at <= time)
				if(ready_list[i].pr > high_pr)		
				{
					high_pr = ready_list[i].pr;
					index=i;
				}
	}
	return index;
}
