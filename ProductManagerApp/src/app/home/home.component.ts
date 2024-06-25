import { Component } from '@angular/core';
import { ChartConfiguration, ChartOptions, ChartType } from 'chart.js';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  public lineChartData: ChartConfiguration<'line'>['data']['datasets'] = [
    { data: [85, 72, 78, 75, 77, 75], label: 'Crude oil prices', borderColor: 'black', backgroundColor: 'rgba(255, 255, 0, 0.28)' }
  ];
  public lineChartLabels: string[] = ['January', 'February', 'March', 'April', 'May', 'June'];
  public lineChartOptions: ChartOptions<'line'> = {
    responsive: true,
  };
  public lineChartLegend = true;
  public lineChartPlugins = [];
  public lineChartType: ChartType = 'line';
}
