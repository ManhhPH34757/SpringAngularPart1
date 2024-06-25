import { Component } from '@angular/core';
import { ProductService } from '../service/product.service';
import { Product } from '../class/product';
import { BrandService } from '../service/brand.service';
import { CategoryService } from '../service/category.service';
import { MaterialService } from '../service/material.service';
import { SoleService } from '../service/sole.service';
import { Brand } from '../class/brand';
import { Category } from '../class/category';
import { Material } from '../class/material';
import { Sole } from '../class/sole';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-product',
  templateUrl: './list-product.component.html',
  styleUrl: './list-product.component.css',
})
export class ListProductComponent {
  products: Product[] = [];
  brands: Brand[] = [];
  categories: Category[] = [];
  materials: Material[] = [];
  soles: Sole[] = [];

  product: Product = new Product();

  onSubmit(){
    console.log(this.product);
    this.createProduct();
  }

  createProduct() {
    this.productService.addProduct(this.product).subscribe((data) => {
      console.log(data);
      this.redirectProduct();
    })
  }

  redirectProduct() {
    this.router.navigate(['/products']);
  }

  constructor(
    private productService: ProductService,
    private brandService: BrandService,
    private categoryService: CategoryService,
    private materialService: MaterialService,
    private soleService: SoleService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.getBrands();
    this.getCategories();
    this.getMaterials();
    this.getSoles();
    this.getProducts();
  }

  getBrands() {
    this.brandService.getListBrand().subscribe((data) => {
      this.brands = data;
    });
  }

  getCategories() {
    this.categoryService.getListCategory().subscribe((data) => {
      this.categories = data;
    });
  }

  getMaterials() {
    this.materialService.getListMaterial().subscribe((data) => {
      this.materials = data;
    });
  }

  getSoles() {
    this.soleService.getListSole().subscribe((data) => {
      this.soles = data;
    });
  }

  getProducts() {
    this.productService.getListProduct().subscribe((data) => {
      this.products = data;
    });
  }
}
