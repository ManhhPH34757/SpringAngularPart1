import { Brand } from './brand';
import { Category } from './category';
import { Material } from './material';
import { Sole } from './sole';

export class Product {
  idProduct: number = 0;
  productCode: string = '';
  productName: string = '';
  idBrand: Brand = new Brand();
  idCategory: Category = new Category();
  idSole: Sole = new Sole();
  idMaterial: Material = new Material();
  images: string = '';
  dateCreated: Date = new Date();
  dateUpdated: Date = new Date();
}
