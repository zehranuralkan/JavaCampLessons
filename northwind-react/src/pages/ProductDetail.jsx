import React, {useState} from 'react'
import { useParams } from 'react-router-dom'

import { Button, Card, Image } from 'semantic-ui-react'
import ProductService from '../services/productService';

import { useEffect } from 'react';
export default function ProductDetail() {
    let { name } = useParams();

    const [product, setProduct] = useState({ });
    useEffect(()=>{
      //komponent yüklendiğinde yapılması gerkeen komut
      let productService=new ProductService()
    productService.getByProductsName(name).then(result=>setProduct(result.data.data))
    },[])

    return (
        <div>
            <Card.Group>


                <Card fluid>
                    <Card.Content>
                        <Image
                            floated='right'
                            size='mini'
                            src='https://react.semantic-ui.com/images/avatar/large/jenny.jpg'
                        />
                        <Card.Header>{product.productName}</Card.Header>
                        <Card.Meta>{product.category?.categoryName}</Card.Meta>
                        <Card.Description>
                            Jenny requested permission to view your contact details
                        </Card.Description>
                    </Card.Content>
                    <Card.Content extra>
                        <div className='ui two buttons'>
                            <Button basic color='green'>
                                Approve
                            </Button>
                            <Button basic color='red'>
                                Decline
                            </Button>
                        </div>
                    </Card.Content>
                </Card>
            </Card.Group>
        </div>
    )
}
